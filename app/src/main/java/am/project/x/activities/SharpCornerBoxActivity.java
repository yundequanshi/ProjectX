package am.project.x.activities;

import android.app.Activity;
import android.os.Bundle;

import am.project.x.R;
import am.project.x.widgets.drawables.SharpCornerBoxDrawable;
import am.project.x.widgets.utils.VersionCompat;


public class SharpCornerBoxActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final int color = 0xffc8e71c;// 0x14000000
        final int width = 42;
        final int height = 18;
        final int padding = 40;
        final float round = 20;
        setContentView(R.layout.old_activity_sharpcornerbox);
        VersionCompat.setBackground(findViewById(R.id.scb_top_center),
                new SharpCornerBoxDrawable(color, width, height));
        VersionCompat.setBackground(findViewById(R.id.scb_top_end),
                new SharpCornerBoxDrawable(color, width, height, SharpCornerBoxDrawable.Direction.TOP,
                        SharpCornerBoxDrawable.Location.END, padding));
        VersionCompat.setBackground(findViewById(R.id.scb_top_start),
                new SharpCornerBoxDrawable(color, width, height, SharpCornerBoxDrawable.Direction.TOP,
                        SharpCornerBoxDrawable.Location.START, padding));

        VersionCompat.setBackground(findViewById(R.id.scb_bottom_center),
                new SharpCornerBoxDrawable(color, width, height,
                        SharpCornerBoxDrawable.Direction.BOTTOM));
        VersionCompat.setBackground(findViewById(R.id.scb_bottom_end),
                new SharpCornerBoxDrawable(color, width, height,
                        SharpCornerBoxDrawable.Direction.BOTTOM, SharpCornerBoxDrawable.Location.END, padding));
        VersionCompat.setBackground(findViewById(R.id.scb_bottom_start),
                new SharpCornerBoxDrawable(color, width, height,
                        SharpCornerBoxDrawable.Direction.BOTTOM, SharpCornerBoxDrawable.Location.START, padding));

        VersionCompat
                .setBackground(findViewById(R.id.scb_left_center),
                        new SharpCornerBoxDrawable(color, width, height,
                                SharpCornerBoxDrawable.Direction.LEFT));
        VersionCompat.setBackground(findViewById(R.id.scb_left_end),
                new SharpCornerBoxDrawable(color, width, height,
                        SharpCornerBoxDrawable.Direction.LEFT, SharpCornerBoxDrawable.Location.END, padding));
        VersionCompat.setBackground(findViewById(R.id.scb_left_start),
                new SharpCornerBoxDrawable(color, width, height,
                        SharpCornerBoxDrawable.Direction.LEFT, SharpCornerBoxDrawable.Location.START, padding));

        VersionCompat.setBackground(findViewById(R.id.scb_right_center),
                new SharpCornerBoxDrawable(color, width, height,
                        SharpCornerBoxDrawable.Direction.RIGHT));
        VersionCompat.setBackground(findViewById(R.id.scb_right_end),
                new SharpCornerBoxDrawable(color, width, height,
                        SharpCornerBoxDrawable.Direction.RIGHT, SharpCornerBoxDrawable.Location.END, padding));
        VersionCompat.setBackground(findViewById(R.id.scb_right_start),
                new SharpCornerBoxDrawable(color, width, height,
                        SharpCornerBoxDrawable.Direction.RIGHT, SharpCornerBoxDrawable.Location.START, padding));

        VersionCompat.setBackground(findViewById(R.id.scb_rr_center),
                new SharpCornerBoxDrawable(color, width, height, SharpCornerBoxDrawable.Direction.TOP,
                        round));
        VersionCompat.setBackground(findViewById(R.id.scb_rr_end),
                new SharpCornerBoxDrawable(color, width, height, SharpCornerBoxDrawable.Direction.TOP,
                        SharpCornerBoxDrawable.Location.END, round));
        VersionCompat.setBackground(findViewById(R.id.scb_rr_start),
                new SharpCornerBoxDrawable(color, width, height, SharpCornerBoxDrawable.Direction.TOP,
                        SharpCornerBoxDrawable.Location.START, round));

        VersionCompat
                .setBackground(findViewById(R.id.scb_null_r),
                        new SharpCornerBoxDrawable(color, width, height,
                                SharpCornerBoxDrawable.Direction.TOP));
        VersionCompat.setBackground(findViewById(R.id.scb_null_rr),
                new SharpCornerBoxDrawable(color, width, height, SharpCornerBoxDrawable.Direction.TOP,
                        round));
    }
}

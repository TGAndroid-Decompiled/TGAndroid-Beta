package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tq0 extends org.telegram.ui.ActionBar.m2 {
    public Bitmap f40471a;
    public BitmapDrawable f40472b;
    public sq0 f40473c;
    public rq0 d;
    public boolean e;
    public boolean f40474f;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackgroundColor(-13421773);
        this.actionBar.B(-12763843, false);
        this.actionBar.setTitleColor(-1);
        this.actionBar.D(-1, false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.CropImage));
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 16));
        this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        rq0 rq0Var = new rq0(this, context);
        this.d = rq0Var;
        this.fragmentView = rq0Var;
        rq0Var.G = getArguments().getBoolean("freeform", false);
        this.fragmentView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return this.fragmentView;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        int max;
        if (this.f40471a == null) {
            String string = getArguments().getString("photoPath");
            Uri uri = (Uri) getArguments().getParcelable("photoUri");
            if (string == null && uri == null) {
                return false;
            }
            if (string != null && !t8.b.t(string)) {
                return false;
            }
            if (AndroidUtilities.isTablet()) {
                max = AndroidUtilities.dp(520.0f);
            } else {
                Point point = AndroidUtilities.displaySize;
                max = Math.max(point.x, point.y);
            }
            float f7 = max;
            Bitmap loadBitmap = ImageLoader.loadBitmap(string, uri, f7, f7, true);
            this.f40471a = loadBitmap;
            if (loadBitmap == null) {
                return false;
            }
        }
        this.f40472b = new BitmapDrawable(this.f40471a);
        super.onFragmentCreate();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        Bitmap bitmap = this.f40471a;
        if (bitmap != null && !this.e) {
            bitmap.recycle();
            this.f40471a = null;
        }
        this.f40472b = null;
    }
}

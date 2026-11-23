package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class tm0 extends org.telegram.ui.ActionBar.g2 {
    public Bitmap f52297a;
    public BitmapDrawable f52298b;
    public sm0 f52299c;
    public rm0 d;
    public boolean f52300e;
    public boolean f52301f;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackgroundColor(-13421773);
        this.actionBar.F(-12763843, false);
        this.actionBar.setTitleColor(-1);
        this.actionBar.G(-1, false);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.hd.N0(2131751686, null));
        this.actionBar.setActionBarMenuOnItemClick(new dv(this, 26));
        this.actionBar.s().h(1, 2131231242, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.hd.N0(2131751342, null));
        rm0 rm0Var = new rm0(this, context);
        this.d = rm0Var;
        this.fragmentView = rm0Var;
        rm0Var.H = getArguments().getBoolean("freeform", false);
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
        if (this.f52297a == null) {
            String string = getArguments().getString("photoPath");
            Uri uri = (Uri) getArguments().getParcelable("photoUri");
            if (string == null && uri == null) {
                return false;
            }
            if (string != null && !a8.p0.B(string)) {
                return false;
            }
            if (org.telegram.messenger.g0.Q1()) {
                max = org.telegram.messenger.g0.L(520.0f);
            } else {
                Point point = org.telegram.messenger.g0.f24010q;
                max = Math.max(point.x, point.y);
            }
            float f10 = max;
            Bitmap K = org.telegram.messenger.fc.K(string, uri, f10, f10, true);
            this.f52297a = K;
            if (K == null) {
                return false;
            }
        }
        this.f52298b = new BitmapDrawable(this.f52297a);
        super.onFragmentCreate();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        Bitmap bitmap = this.f52297a;
        if (bitmap != null && !this.f52300e) {
            bitmap.recycle();
            this.f52297a = null;
        }
        this.f52298b = null;
    }
}

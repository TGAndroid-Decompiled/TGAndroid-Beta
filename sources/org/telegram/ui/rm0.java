package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class rm0 extends org.telegram.ui.ActionBar.e2 {
    public Bitmap f50971a;
    public BitmapDrawable f50972b;
    public qm0 f50973c;
    public pm0 d;
    public boolean f50974e;
    public boolean f50975f;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackgroundColor(-13421773);
        this.actionBar.F(-12763843, false);
        this.actionBar.setTitleColor(-1);
        this.actionBar.H(-1, false);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131751698, null));
        this.actionBar.setActionBarMenuOnItemClick(new lx(this, 24));
        this.actionBar.s().h(1, 2131231242, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.hd.M0(2131751354, null));
        pm0 pm0Var = new pm0(this, context);
        this.d = pm0Var;
        this.fragmentView = pm0Var;
        pm0Var.H = getArguments().getBoolean("freeform", false);
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
        if (this.f50971a == null) {
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
                Point point = org.telegram.messenger.g0.f23611q;
                max = Math.max(point.x, point.y);
            }
            float f10 = max;
            Bitmap K = org.telegram.messenger.fc.K(string, uri, f10, f10, true);
            this.f50971a = K;
            if (K == null) {
                return false;
            }
        }
        this.f50972b = new BitmapDrawable(this.f50971a);
        super.onFragmentCreate();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        Bitmap bitmap = this.f50971a;
        if (bitmap != null && !this.f50974e) {
            bitmap.recycle();
            this.f50971a = null;
        }
        this.f50972b = null;
    }
}

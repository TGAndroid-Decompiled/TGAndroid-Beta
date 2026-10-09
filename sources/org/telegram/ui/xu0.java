package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
public final class xu0 extends org.telegram.ui.Components.pm0 {
    public final Context f44152c;
    public final PhotoViewer d;

    public xu0(Context context, PhotoViewer photoViewer) {
        this.d = photoViewer;
        this.f44152c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final int h() {
        PhotoViewer photoViewer = this.d;
        cv0 cv0Var = photoViewer.d;
        if (cv0Var != null && cv0Var.c() != null) {
            return photoViewer.d.c().size();
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) d1Var.f47658a;
        int dp = AndroidUtilities.dp(85.0f);
        if (i10 != 0) {
            i11 = AndroidUtilities.dp(6.0f);
        } else {
            i11 = 0;
        }
        z5Var.f23805f = dp;
        org.telegram.ui.Components.dq dqVar = z5Var.f23803c;
        org.telegram.ui.Components.y9 y9Var = z5Var.f23801a;
        t5 t5Var = z5Var.f23804e;
        z5Var.h = i11;
        ((FrameLayout.LayoutParams) z5Var.f23802b.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) y9Var.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) t5Var.getLayoutParams()).rightMargin = i11;
        y9Var.q(0, true);
        PhotoViewer photoViewer = this.d;
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i10));
        if (obj instanceof MediaController.PhotoEntry) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            z5Var.setTag(photoEntry);
            t5Var.setVisibility(4);
            String str = photoEntry.thumbPath;
            Context context = this.f44152c;
            if (str != null) {
                y9Var.f(str, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else if (photoEntry.path != null) {
                y9Var.p(photoEntry.orientation, photoEntry.invert, true);
                if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    t5Var.setVisibility(0);
                    z5Var.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                    y9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                } else {
                    y9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                }
            } else {
                y9Var.setImageResource(R.drawable.nophotos);
            }
            dqVar.f25790a.f(-1, true, false);
            dqVar.setVisibility(0);
        } else if (obj instanceof MediaController.SearchImage) {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            z5Var.setTag(searchImage);
            z5Var.setImage(searchImage);
            t5Var.setVisibility(4);
            dqVar.f25790a.f(-1, true, false);
            dqVar.setVisibility(0);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f44152c;
        ?? frameLayout = new FrameLayout(context);
        new Paint();
        frameLayout.setWillNotDraw(false);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        frameLayout.f23801a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        frameLayout.addView(y9Var, w7.x5.d(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.f23802b = frameLayout2;
        frameLayout.addView(frameLayout2, w7.x5.e(42, 42, 53));
        t5 t5Var = new t5(context);
        t5Var.f41846c = new Path();
        t5Var.d = new float[8];
        t5Var.f41845b = new RectF();
        t5Var.f41847e = new Paint(1);
        frameLayout.f23804e = t5Var;
        t5Var.setWillNotDraw(false);
        t5Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        frameLayout.addView(t5Var, w7.x5.e(-1, 16, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_video);
        t5Var.addView(imageView, w7.x5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        frameLayout.d = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        t5Var.addView(textView, w7.x5.a(-2.0f, 18.0f, -0.7f, 0.0f, 0.0f, -2, 19));
        org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(context, 24, null);
        frameLayout.f23803c = dqVar;
        dqVar.setDrawBackgroundAsArc(11);
        dqVar.b(org.telegram.ui.ActionBar.i6.W9, org.telegram.ui.ActionBar.i6.X9, org.telegram.ui.ActionBar.i6.V9);
        frameLayout.addView(dqVar, w7.x5.a(26.0f, 55.0f, 4.0f, 0.0f, 0.0f, 26, 51));
        dqVar.setVisibility(0);
        frameLayout.setFocusable(true);
        frameLayout2.setOnClickListener(new m60(this, 19));
        return new s4.d1(frameLayout);
    }
}

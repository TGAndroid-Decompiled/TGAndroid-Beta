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
public final class wu0 extends org.telegram.ui.Components.rm0 {
    public final Context f43877c;
    public final PhotoViewer d;

    public wu0(Context context, PhotoViewer photoViewer) {
        this.d = photoViewer;
        this.f43877c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final int h() {
        PhotoViewer photoViewer = this.d;
        bv0 bv0Var = photoViewer.d;
        if (bv0Var != null && bv0Var.c() != null) {
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
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) d1Var.f47748a;
        int dp = AndroidUtilities.dp(85.0f);
        if (i10 != 0) {
            i11 = AndroidUtilities.dp(6.0f);
        } else {
            i11 = 0;
        }
        z5Var.f23797f = dp;
        org.telegram.ui.Components.dq dqVar = z5Var.f23795c;
        org.telegram.ui.Components.y9 y9Var = z5Var.f23793a;
        s5 s5Var = z5Var.f23796e;
        z5Var.h = i11;
        ((FrameLayout.LayoutParams) z5Var.f23794b.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) y9Var.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) s5Var.getLayoutParams()).rightMargin = i11;
        y9Var.q(0, true);
        PhotoViewer photoViewer = this.d;
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i10));
        if (obj instanceof MediaController.PhotoEntry) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            z5Var.setTag(photoEntry);
            s5Var.setVisibility(4);
            String str = photoEntry.thumbPath;
            Context context = this.f43877c;
            if (str != null) {
                y9Var.f(str, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else if (photoEntry.path != null) {
                y9Var.p(photoEntry.orientation, photoEntry.invert, true);
                if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    s5Var.setVisibility(0);
                    z5Var.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                    y9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                } else {
                    y9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                }
            } else {
                y9Var.setImageResource(R.drawable.nophotos);
            }
            dqVar.f25656a.f(-1, true, false);
            dqVar.setVisibility(0);
        } else if (obj instanceof MediaController.SearchImage) {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            z5Var.setTag(searchImage);
            z5Var.setImage(searchImage);
            s5Var.setVisibility(4);
            dqVar.f25656a.f(-1, true, false);
            dqVar.setVisibility(0);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f43877c;
        ?? frameLayout = new FrameLayout(context);
        new Paint();
        frameLayout.setWillNotDraw(false);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        frameLayout.f23793a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        frameLayout.addView(y9Var, w7.x5.d(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.f23794b = frameLayout2;
        frameLayout.addView(frameLayout2, w7.x5.e(42, 42, 53));
        s5 s5Var = new s5(context);
        s5Var.f41585c = new Path();
        s5Var.d = new float[8];
        s5Var.f41584b = new RectF();
        s5Var.f41586e = new Paint(1);
        frameLayout.f23796e = s5Var;
        s5Var.setWillNotDraw(false);
        s5Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        frameLayout.addView(s5Var, w7.x5.e(-1, 16, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_video);
        s5Var.addView(imageView, w7.x5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        frameLayout.d = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        s5Var.addView(textView, w7.x5.a(-2.0f, 18.0f, -0.7f, 0.0f, 0.0f, -2, 19));
        org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(context, 24, null);
        frameLayout.f23795c = dqVar;
        dqVar.setDrawBackgroundAsArc(11);
        dqVar.b(org.telegram.ui.ActionBar.h6.W9, org.telegram.ui.ActionBar.h6.X9, org.telegram.ui.ActionBar.h6.V9);
        frameLayout.addView(dqVar, w7.x5.a(26.0f, 55.0f, 4.0f, 0.0f, 0.0f, 26, 51));
        dqVar.setVisibility(0);
        frameLayout.setFocusable(true);
        frameLayout2.setOnClickListener(new m60(this, 19));
        return new s4.d1(frameLayout);
    }
}

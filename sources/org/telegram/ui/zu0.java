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
public final class zu0 extends org.telegram.ui.Components.vm0 {
    public final Context f44921c;
    public final PhotoViewer d;

    public zu0(Context context, PhotoViewer photoViewer) {
        this.d = photoViewer;
        this.f44921c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final int h() {
        PhotoViewer photoViewer = this.d;
        ev0 ev0Var = photoViewer.d;
        if (ev0Var != null && ev0Var.c() != null) {
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
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) d1Var.f47889a;
        int dp = AndroidUtilities.dp(85.0f);
        if (i10 != 0) {
            i11 = AndroidUtilities.dp(6.0f);
        } else {
            i11 = 0;
        }
        z5Var.f23568f = dp;
        org.telegram.ui.Components.fq fqVar = z5Var.f23566c;
        org.telegram.ui.Components.y9 y9Var = z5Var.f23564a;
        w5 w5Var = z5Var.f23567e;
        z5Var.h = i11;
        ((FrameLayout.LayoutParams) z5Var.f23565b.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) y9Var.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) w5Var.getLayoutParams()).rightMargin = i11;
        y9Var.q(0, true);
        PhotoViewer photoViewer = this.d;
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i10));
        if (obj instanceof MediaController.PhotoEntry) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            z5Var.setTag(photoEntry);
            w5Var.setVisibility(4);
            String str = photoEntry.thumbPath;
            Context context = this.f44921c;
            if (str != null) {
                y9Var.f(str, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else if (photoEntry.path != null) {
                y9Var.p(photoEntry.orientation, photoEntry.invert, true);
                if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    w5Var.setVisibility(0);
                    z5Var.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                    y9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                } else {
                    y9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                }
            } else {
                y9Var.setImageResource(R.drawable.nophotos);
            }
            fqVar.f26150a.f(-1, true, false);
            fqVar.setVisibility(0);
        } else if (obj instanceof MediaController.SearchImage) {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            z5Var.setTag(searchImage);
            z5Var.setImage(searchImage);
            w5Var.setVisibility(4);
            fqVar.f26150a.f(-1, true, false);
            fqVar.setVisibility(0);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f44921c;
        ?? frameLayout = new FrameLayout(context);
        new Paint();
        frameLayout.setWillNotDraw(false);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        frameLayout.f23564a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        frameLayout.addView(y9Var, w7.w5.d(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.f23565b = frameLayout2;
        frameLayout.addView(frameLayout2, w7.w5.e(42, 42, 53));
        w5 w5Var = new w5(context);
        w5Var.f43040c = new Path();
        w5Var.d = new float[8];
        w5Var.f43039b = new RectF();
        w5Var.f43041e = new Paint(1);
        frameLayout.f23567e = w5Var;
        w5Var.setWillNotDraw(false);
        w5Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        frameLayout.addView(w5Var, w7.w5.e(-1, 16, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_video);
        w5Var.addView(imageView, w7.w5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        frameLayout.d = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        w5Var.addView(textView, w7.w5.a(-2.0f, 18.0f, -0.7f, 0.0f, 0.0f, -2, 19));
        org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(context, 24, null);
        frameLayout.f23566c = fqVar;
        fqVar.setDrawBackgroundAsArc(11);
        fqVar.b(org.telegram.ui.ActionBar.h6.W9, org.telegram.ui.ActionBar.h6.X9, org.telegram.ui.ActionBar.h6.V9);
        frameLayout.addView(fqVar, w7.w5.a(26.0f, 55.0f, 4.0f, 0.0f, 0.0f, 26, 51));
        fqVar.setVisibility(0);
        frameLayout.setFocusable(true);
        frameLayout2.setOnClickListener(new o60(this, 19));
        return new s4.d1(frameLayout);
    }
}

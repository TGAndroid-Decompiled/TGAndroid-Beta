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
public final class yu0 extends org.telegram.ui.Components.ll0 {
    public final Context f40023c;
    public final PhotoViewer d;

    public yu0(Context context, PhotoViewer photoViewer) {
        this.d = photoViewer;
        this.f40023c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        PhotoViewer photoViewer = this.d;
        dv0 dv0Var = photoViewer.d;
        if (dv0Var != null && dv0Var.c() != null) {
            return photoViewer.d.c().size();
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) c1Var.f42697a;
        int dp = AndroidUtilities.dp(85.0f);
        if (i10 != 0) {
            i11 = AndroidUtilities.dp(6.0f);
        } else {
            i11 = 0;
        }
        y5Var.f21668f = dp;
        org.telegram.ui.Components.np npVar = y5Var.f21667c;
        org.telegram.ui.Components.u9 u9Var = y5Var.f21665a;
        t5 t5Var = y5Var.e;
        y5Var.h = i11;
        ((FrameLayout.LayoutParams) y5Var.f21666b.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) u9Var.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) t5Var.getLayoutParams()).rightMargin = i11;
        u9Var.q(0, true);
        PhotoViewer photoViewer = this.d;
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i10));
        if (obj instanceof MediaController.PhotoEntry) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            y5Var.setTag(photoEntry);
            t5Var.setVisibility(4);
            String str = photoEntry.thumbPath;
            Context context = this.f40023c;
            if (str != null) {
                u9Var.f(str, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else if (photoEntry.path != null) {
                u9Var.p(photoEntry.orientation, photoEntry.invert, true);
                if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    t5Var.setVisibility(0);
                    y5Var.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                    u9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                } else {
                    u9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                }
            } else {
                u9Var.setImageResource(R.drawable.nophotos);
            }
            npVar.f26508a.f(-1, true, false);
            npVar.setVisibility(0);
        } else if (obj instanceof MediaController.SearchImage) {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            y5Var.setTag(searchImage);
            y5Var.setImage(searchImage);
            t5Var.setVisibility(4);
            npVar.f26508a.f(-1, true, false);
            npVar.setVisibility(0);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f40023c;
        ?? frameLayout = new FrameLayout(context);
        new Paint();
        frameLayout.setWillNotDraw(false);
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        frameLayout.f21665a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        frameLayout.addView(u9Var, w7.x5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.f21666b = frameLayout2;
        frameLayout.addView(frameLayout2, w7.x5.e(42, 42, 53));
        t5 t5Var = new t5(context);
        t5Var.f37653c = new Path();
        t5Var.d = new float[8];
        t5Var.f37652b = new RectF();
        t5Var.e = new Paint(1);
        frameLayout.e = t5Var;
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
        t5Var.addView(textView, w7.x5.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
        org.telegram.ui.Components.np npVar = new org.telegram.ui.Components.np(context, 24, null);
        frameLayout.f21667c = npVar;
        npVar.setDrawBackgroundAsArc(11);
        npVar.b(org.telegram.ui.ActionBar.j6.W9, org.telegram.ui.ActionBar.j6.X9, org.telegram.ui.ActionBar.j6.V9);
        frameLayout.addView(npVar, w7.x5.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
        npVar.setVisibility(0);
        frameLayout.setFocusable(true);
        frameLayout2.setOnClickListener(new m60(this, 20));
        return new s4.c1(frameLayout);
    }
}

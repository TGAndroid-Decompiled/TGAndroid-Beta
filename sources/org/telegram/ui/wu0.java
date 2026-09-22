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
public final class wu0 extends org.telegram.ui.Components.xl0 {
    public final Context f39271c;
    public final PhotoViewer d;

    public wu0(Context context, PhotoViewer photoViewer) {
        this.d = photoViewer;
        this.f39271c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
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
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) c1Var.f42995a;
        int dp = AndroidUtilities.dp(85.0f);
        if (i10 != 0) {
            i11 = AndroidUtilities.dp(6.0f);
        } else {
            i11 = 0;
        }
        a6Var.f20035f = dp;
        org.telegram.ui.Components.np npVar = a6Var.f20034c;
        org.telegram.ui.Components.v9 v9Var = a6Var.f20032a;
        t5 t5Var = a6Var.e;
        a6Var.h = i11;
        ((FrameLayout.LayoutParams) a6Var.f20033b.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) v9Var.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) t5Var.getLayoutParams()).rightMargin = i11;
        v9Var.q(0, true);
        PhotoViewer photoViewer = this.d;
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i10));
        if (obj instanceof MediaController.PhotoEntry) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            a6Var.setTag(photoEntry);
            t5Var.setVisibility(4);
            String str = photoEntry.thumbPath;
            Context context = this.f39271c;
            if (str != null) {
                v9Var.f(str, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else if (photoEntry.path != null) {
                v9Var.p(photoEntry.orientation, photoEntry.invert, true);
                if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    t5Var.setVisibility(0);
                    a6Var.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                    v9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                } else {
                    v9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                }
            } else {
                v9Var.setImageResource(R.drawable.nophotos);
            }
            npVar.f26861a.f(-1, true, false);
            npVar.setVisibility(0);
        } else if (obj instanceof MediaController.SearchImage) {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            a6Var.setTag(searchImage);
            a6Var.setImage(searchImage);
            t5Var.setVisibility(4);
            npVar.f26861a.f(-1, true, false);
            npVar.setVisibility(0);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f39271c;
        ?? frameLayout = new FrameLayout(context);
        new Paint();
        frameLayout.setWillNotDraw(false);
        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(context);
        frameLayout.f20032a = v9Var;
        v9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        frameLayout.addView(v9Var, w7.y5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.f20033b = frameLayout2;
        frameLayout.addView(frameLayout2, w7.y5.e(42, 42, 53));
        t5 t5Var = new t5(context);
        t5Var.f37646c = new Path();
        t5Var.d = new float[8];
        t5Var.f37645b = new RectF();
        t5Var.e = new Paint(1);
        frameLayout.e = t5Var;
        t5Var.setWillNotDraw(false);
        t5Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        frameLayout.addView(t5Var, w7.y5.e(-1, 16, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_video);
        t5Var.addView(imageView, w7.y5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        frameLayout.d = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        t5Var.addView(textView, w7.y5.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
        org.telegram.ui.Components.np npVar = new org.telegram.ui.Components.np(context, 24, null);
        frameLayout.f20034c = npVar;
        npVar.setDrawBackgroundAsArc(11);
        npVar.b(org.telegram.ui.ActionBar.j6.W9, org.telegram.ui.ActionBar.j6.X9, org.telegram.ui.ActionBar.j6.V9);
        frameLayout.addView(npVar, w7.y5.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
        npVar.setVisibility(0);
        frameLayout.setFocusable(true);
        frameLayout2.setOnClickListener(new k60(this, 20));
        return new s4.c1(frameLayout);
    }
}

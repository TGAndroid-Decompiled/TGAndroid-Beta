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
public final class ru0 extends org.telegram.ui.Components.xl0 {
    public final Context f37238c;
    public final PhotoViewer d;

    public ru0(Context context, PhotoViewer photoViewer) {
        this.d = photoViewer;
        this.f37238c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        PhotoViewer photoViewer = this.d;
        wu0 wu0Var = photoViewer.d;
        if (wu0Var != null && wu0Var.c() != null) {
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
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) c1Var.f43005a;
        int dp = AndroidUtilities.dp(85.0f);
        if (i10 != 0) {
            i11 = AndroidUtilities.dp(6.0f);
        } else {
            i11 = 0;
        }
        z5Var.f21914f = dp;
        org.telegram.ui.Components.pp ppVar = z5Var.f21913c;
        org.telegram.ui.Components.w9 w9Var = z5Var.f21911a;
        v5 v5Var = z5Var.e;
        z5Var.h = i11;
        ((FrameLayout.LayoutParams) z5Var.f21912b.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) w9Var.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) v5Var.getLayoutParams()).rightMargin = i11;
        w9Var.q(0, true);
        PhotoViewer photoViewer = this.d;
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i10));
        if (obj instanceof MediaController.PhotoEntry) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            z5Var.setTag(photoEntry);
            v5Var.setVisibility(4);
            String str = photoEntry.thumbPath;
            Context context = this.f37238c;
            if (str != null) {
                w9Var.f(str, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else if (photoEntry.path != null) {
                w9Var.p(photoEntry.orientation, photoEntry.invert, true);
                if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    v5Var.setVisibility(0);
                    z5Var.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                    w9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                } else {
                    w9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                }
            } else {
                w9Var.setImageResource(R.drawable.nophotos);
            }
            ppVar.f27437a.f(-1, true, false);
            ppVar.setVisibility(0);
        } else if (obj instanceof MediaController.SearchImage) {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            z5Var.setTag(searchImage);
            z5Var.setImage(searchImage);
            v5Var.setVisibility(4);
            ppVar.f27437a.f(-1, true, false);
            ppVar.setVisibility(0);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f37238c;
        ?? frameLayout = new FrameLayout(context);
        new Paint();
        frameLayout.setWillNotDraw(false);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        frameLayout.f21911a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        frameLayout.addView(w9Var, w7.y5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.f21912b = frameLayout2;
        frameLayout.addView(frameLayout2, w7.y5.e(42, 42, 53));
        v5 v5Var = new v5(context);
        v5Var.f38449c = new Path();
        v5Var.d = new float[8];
        v5Var.f38448b = new RectF();
        v5Var.e = new Paint(1);
        frameLayout.e = v5Var;
        v5Var.setWillNotDraw(false);
        v5Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        frameLayout.addView(v5Var, w7.y5.e(-1, 16, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_video);
        v5Var.addView(imageView, w7.y5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        frameLayout.d = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        v5Var.addView(textView, w7.y5.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
        org.telegram.ui.Components.pp ppVar = new org.telegram.ui.Components.pp(context, 24, null);
        frameLayout.f21913c = ppVar;
        ppVar.setDrawBackgroundAsArc(11);
        ppVar.b(org.telegram.ui.ActionBar.i6.W9, org.telegram.ui.ActionBar.i6.X9, org.telegram.ui.ActionBar.i6.V9);
        frameLayout.addView(ppVar, w7.y5.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
        ppVar.setVisibility(0);
        frameLayout.setFocusable(true);
        frameLayout2.setOnClickListener(new i60(this, 20));
        return new s4.c1(frameLayout);
    }
}

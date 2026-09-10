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
public final class xu0 extends org.telegram.ui.Components.ul0 {
    public final Context f38830c;
    public final PhotoViewer d;

    public xu0(Context context, PhotoViewer photoViewer) {
        this.d = photoViewer;
        this.f38830c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
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
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) c1Var.f41610a;
        int dp = AndroidUtilities.dp(85.0f);
        if (i10 != 0) {
            i11 = AndroidUtilities.dp(6.0f);
        } else {
            i11 = 0;
        }
        a6Var.f18876f = dp;
        org.telegram.ui.Components.tp tpVar = a6Var.f18875c;
        org.telegram.ui.Components.w9 w9Var = a6Var.f18873a;
        u5 u5Var = a6Var.e;
        a6Var.h = i11;
        ((FrameLayout.LayoutParams) a6Var.f18874b.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) w9Var.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) u5Var.getLayoutParams()).rightMargin = i11;
        w9Var.q(0, true);
        PhotoViewer photoViewer = this.d;
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i10));
        if (obj instanceof MediaController.PhotoEntry) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            a6Var.setTag(photoEntry);
            u5Var.setVisibility(4);
            String str = photoEntry.thumbPath;
            Context context = this.f38830c;
            if (str != null) {
                w9Var.f(str, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else if (photoEntry.path != null) {
                w9Var.p(photoEntry.orientation, photoEntry.invert, true);
                if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    u5Var.setVisibility(0);
                    a6Var.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                    w9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                } else {
                    w9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                }
            } else {
                w9Var.setImageResource(R.drawable.nophotos);
            }
            tpVar.f27462a.f(-1, true, false);
            tpVar.setVisibility(0);
        } else if (obj instanceof MediaController.SearchImage) {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            a6Var.setTag(searchImage);
            a6Var.setImage(searchImage);
            u5Var.setVisibility(4);
            tpVar.f27462a.f(-1, true, false);
            tpVar.setVisibility(0);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f38830c;
        ?? frameLayout = new FrameLayout(context);
        new Paint();
        frameLayout.setWillNotDraw(false);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        frameLayout.f18873a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        frameLayout.addView(w9Var, w7.a6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.f18874b = frameLayout2;
        frameLayout.addView(frameLayout2, w7.a6.e(42, 42, 53));
        u5 u5Var = new u5(context);
        u5Var.f37110c = new Path();
        u5Var.d = new float[8];
        u5Var.f37109b = new RectF();
        u5Var.e = new Paint(1);
        frameLayout.e = u5Var;
        u5Var.setWillNotDraw(false);
        u5Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        frameLayout.addView(u5Var, w7.a6.e(-1, 16, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_video);
        u5Var.addView(imageView, w7.a6.e(-2, -2, 19));
        TextView textView = new TextView(context);
        frameLayout.d = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        u5Var.addView(textView, w7.a6.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
        org.telegram.ui.Components.tp tpVar = new org.telegram.ui.Components.tp(context, 24, null);
        frameLayout.f18875c = tpVar;
        tpVar.setDrawBackgroundAsArc(11);
        tpVar.b(org.telegram.ui.ActionBar.j6.W9, org.telegram.ui.ActionBar.j6.X9, org.telegram.ui.ActionBar.j6.V9);
        frameLayout.addView(tpVar, w7.a6.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
        tpVar.setVisibility(0);
        frameLayout.setFocusable(true);
        frameLayout2.setOnClickListener(new l60(this, 20));
        return new s4.c1(frameLayout);
    }
}

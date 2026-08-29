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
public final class st0 extends org.telegram.ui.Components.il0 {
    public final Context f42461c;
    public final PhotoViewer d;

    public st0(Context context, PhotoViewer photoViewer) {
        this.d = photoViewer;
        this.f42461c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override
    public final int h() {
        PhotoViewer photoViewer = this.d;
        xt0 xt0Var = photoViewer.d;
        if (xt0Var != null && xt0Var.c() != null) {
            return photoViewer.d.c().size();
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) n1Var.f6432a;
        int dp = AndroidUtilities.dp(85.0f);
        if (i10 != 0) {
            i11 = AndroidUtilities.dp(6.0f);
        } else {
            i11 = 0;
        }
        x5Var.f25924f = dp;
        org.telegram.ui.Components.hp hpVar = x5Var.f25922c;
        org.telegram.ui.Components.t9 t9Var = x5Var.f25920a;
        bg.u1 u1Var = x5Var.f25923e;
        x5Var.h = i11;
        ((FrameLayout.LayoutParams) x5Var.f25921b.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) t9Var.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) u1Var.getLayoutParams()).rightMargin = i11;
        t9Var.q(0, true);
        PhotoViewer photoViewer = this.d;
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i10));
        if (obj instanceof MediaController.PhotoEntry) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            x5Var.setTag(photoEntry);
            u1Var.setVisibility(4);
            String str = photoEntry.thumbPath;
            Context context = this.f42461c;
            if (str != null) {
                t9Var.f(str, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else if (photoEntry.path != null) {
                t9Var.p(photoEntry.orientation, photoEntry.invert, true);
                if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    u1Var.setVisibility(0);
                    x5Var.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                    t9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                } else {
                    t9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                }
            } else {
                t9Var.setImageResource(R.drawable.nophotos);
            }
            hpVar.f29211a.f(-1, true, false);
            hpVar.setVisibility(0);
        } else if (obj instanceof MediaController.SearchImage) {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            x5Var.setTag(searchImage);
            x5Var.setImage(searchImage);
            u1Var.setVisibility(4);
            hpVar.f29211a.f(-1, true, false);
            hpVar.setVisibility(0);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f42461c;
        ?? frameLayout = new FrameLayout(context);
        new Paint();
        frameLayout.setWillNotDraw(false);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        frameLayout.f25920a = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        frameLayout.addView(t9Var, i7.f6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.f25921b = frameLayout2;
        frameLayout.addView(frameLayout2, i7.f6.e(42, 42, 53));
        bg.u1 u1Var = new bg.u1(context);
        u1Var.d = new Path();
        u1Var.f2544c = new float[8];
        u1Var.f2543b = new RectF();
        u1Var.f2545e = new Paint(1);
        frameLayout.f25923e = u1Var;
        u1Var.setWillNotDraw(false);
        u1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        frameLayout.addView(u1Var, i7.f6.e(-1, 16, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_video);
        u1Var.addView(imageView, i7.f6.e(-2, -2, 19));
        TextView textView = new TextView(context);
        frameLayout.d = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        u1Var.addView(textView, i7.f6.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
        org.telegram.ui.Components.hp hpVar = new org.telegram.ui.Components.hp(context, 24, null);
        frameLayout.f25922c = hpVar;
        hpVar.setDrawBackgroundAsArc(11);
        hpVar.b(org.telegram.ui.ActionBar.g6.W9, org.telegram.ui.ActionBar.g6.X9, org.telegram.ui.ActionBar.g6.V9);
        frameLayout.addView(hpVar, i7.f6.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
        hpVar.setVisibility(0);
        frameLayout.setFocusable(true);
        frameLayout2.setOnClickListener(new t50(this, 21));
        return new f2.n1(frameLayout);
    }
}

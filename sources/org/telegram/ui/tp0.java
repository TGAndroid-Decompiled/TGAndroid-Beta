package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.webkit.CookieManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.Components.RadialProgressView;
public final class tp0 extends org.telegram.ui.Components.ud0 {
    public final Rect N;
    public final PhotoViewer O;

    public tp0(PhotoViewer photoViewer, PhotoViewer photoViewer2, Context context, org.telegram.ui.ActionBar.y0 y0Var) {
        super(context);
        this.O = photoViewer;
        this.f38719a = org.telegram.messenger.h10.f22829t0;
        this.f38727w = new ArrayList();
        this.M = new org.telegram.ui.Components.jb0(this, 7);
        this.f38720b = photoViewer2;
        this.f38725r = y0Var;
        org.telegram.ui.Components.pt ptVar = new org.telegram.ui.Components.pt(this, context, context, 1);
        this.f38723f = ptVar;
        ptVar.getSettings().setJavaScriptEnabled(true);
        ptVar.getSettings().setDomStorageEnabled(true);
        ptVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        ptVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(ptVar, true);
        ptVar.setWebViewClient(new o1(this, 2));
        addView(ptVar, b8.mf.e(-1, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f38721c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        addView(linearLayout, b8.mf.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28273y6, null);
        textView.setGravity(17);
        linearLayout.addView(textView, b8.mf.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.f38722e = textView2;
        textView2.setTextSize(1, 16.0f);
        int i3 = org.telegram.ui.ActionBar.k6.f28062n6;
        org.telegram.ui.ActionBar.r6.V(textView2, i3, null);
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        int i10 = org.telegram.ui.ActionBar.y5.f28879a;
        textView2.setBackground(org.telegram.ui.ActionBar.y5.d(0, org.telegram.ui.ActionBar.y5.b(org.telegram.ui.ActionBar.k6.x0(null, i3, false)), 12.0f));
        textView2.setVisibility(8);
        linearLayout.addView(textView2, b8.mf.t(-2, -2, 1, 0, 8, 0, 0));
        ai.x2 x2Var = new ai.x2(22, context, this);
        this.h = x2Var;
        x2Var.setBackgroundColor(-16777216);
        x2Var.setVisibility(4);
        addView(x2Var, b8.mf.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f38724n = radialProgressView;
        radialProgressView.setVisibility(4);
        addView(radialProgressView, b8.mf.e(-2, -2, 17));
        this.N = new Rect();
    }

    public final void j(Canvas canvas, int i3, int i10) {
        Bitmap n4 = this.O.D4.n();
        if (n4 != null) {
            float min = Math.min(i3 / n4.getWidth(), i10 / n4.getHeight());
            int width = (int) (n4.getWidth() * min);
            int height = (int) (n4.getHeight() * min);
            int i11 = (i10 - height) / 2;
            int i12 = (i3 - width) / 2;
            Rect rect = this.N;
            rect.set(i12, i11, width + i12, height + i11);
            canvas.drawBitmap(n4, (Rect) null, rect, (Paint) null);
        }
    }
}

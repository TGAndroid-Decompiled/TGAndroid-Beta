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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.RadialProgressView;
public final class vt0 extends org.telegram.ui.Components.mg0 {
    public final Rect M;
    public final PhotoViewer N;

    public vt0(PhotoViewer photoViewer, PhotoViewer photoViewer2, Context context, org.telegram.ui.ActionBar.g1 g1Var) {
        super(context);
        this.N = photoViewer;
        this.f30572a = UserConfig.selectedAccount;
        this.v = new ArrayList();
        this.L = new org.telegram.ui.Components.wa0(this, 12);
        this.f30573b = photoViewer2;
        this.f30577r = g1Var;
        org.telegram.ui.Components.xu xuVar = new org.telegram.ui.Components.xu(this, context, context, 1);
        this.f30575f = xuVar;
        xuVar.getSettings().setJavaScriptEnabled(true);
        xuVar.getSettings().setDomStorageEnabled(true);
        xuVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        xuVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(xuVar, true);
        xuVar.setWebViewClient(new org.telegram.ui.Components.ig0(this, 0));
        addView(xuVar, org.telegram.ui.Components.gb1.i(-1, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f30574c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        addView(linearLayout, org.telegram.ui.Components.gb1.i(-2, -2, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23746y6, null);
        textView.setGravity(17);
        linearLayout.addView(textView, org.telegram.ui.Components.gb1.u(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.y6.f23538n6;
        org.telegram.ui.ActionBar.f7.V(textView2, i10, null);
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        int i11 = org.telegram.ui.ActionBar.o6.f22919a;
        textView2.setBackground(org.telegram.ui.ActionBar.o6.d(new float[]{12.0f}, 0, org.telegram.ui.ActionBar.o6.b(org.telegram.ui.ActionBar.y6.x0(null, i10, false))));
        textView2.setVisibility(8);
        linearLayout.addView(textView2, org.telegram.ui.Components.gb1.x(-2, -2, 1, 0, 8, 0, 0));
        bi.cc ccVar = new bi.cc(this, context, 20);
        this.h = ccVar;
        ccVar.setBackgroundColor(-16777216);
        ccVar.setVisibility(4);
        addView(ccVar, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f30576n = radialProgressView;
        radialProgressView.setVisibility(4);
        addView(radialProgressView, org.telegram.ui.Components.gb1.i(-2, -2, 17));
        this.M = new Rect();
    }

    public final void j(Canvas canvas, int i10, int i11) {
        Bitmap bitmap = this.N.C4.getBitmap();
        if (bitmap != null) {
            float min = Math.min(i10 / bitmap.getWidth(), i11 / bitmap.getHeight());
            int width = (int) (bitmap.getWidth() * min);
            int height = (int) (bitmap.getHeight() * min);
            int i12 = (i11 - height) / 2;
            int i13 = (i10 - width) / 2;
            Rect rect = this.M;
            rect.set(i13, i12, width + i13, height + i12);
            canvas.drawBitmap(bitmap, (Rect) null, rect, (Paint) null);
        }
    }
}

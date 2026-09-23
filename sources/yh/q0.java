package yh;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.w9;
public final class q0 extends FrameLayout implements le.e {
    public final org.telegram.ui.ActionBar.d6 f47570a;
    public final FrameLayout f47571b;
    public final xh.f1 f47572c;
    public final w9 d;
    public final TextView e;
    public final TextView f47573f;
    public Integer h;
    public TLRPC.Document f47574n;
    public final le.c f47575r;
    public boolean f47576s;
    public o0 v;

    public q0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f47575r = new le.c(0, this, rr.h, 320L, false);
        this.f47570a = d6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f47571b = frameLayout;
        xh.f1 f1Var = new xh.f1(frameLayout, d6Var, true);
        this.f47572c = f1Var;
        frameLayout.setBackground(f1Var);
        f1Var.v = 1;
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        w9 w9Var = new w9(context);
        this.d = w9Var;
        w9Var.getImageReceiver().setAutoRepeat(0);
        addView(w9Var, w7.x5.d(80, 80.0f, 49, 0.0f, 17.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        addView(textView, w7.x5.d(-1, -2.0f, 0, 12.0f, 106.0f, 12.0f, 14.0f));
        TextView textView2 = new TextView(context);
        this.f47573f = textView2;
        textView2.setClickable(false);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 11.0f);
        textView2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
        textView2.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(10.0f), 285212671));
        addView(textView2, w7.x5.d(-2, -2.0f, 53, 0.0f, 10.0f, 10.0f, 0.0f));
    }

    public static void a(q0 q0Var, TLRPC.Document document, int i10, Object obj, boolean z10) {
        String str;
        w9 w9Var = q0Var.d;
        if (document == null) {
            w9Var.b();
            q0Var.f47574n = null;
        } else if (q0Var.f47574n == document) {
        } else {
            q0Var.f47574n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.h6.f18733a7, 0.3f);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append("_");
            sb2.append(i10);
            if (z10) {
                str = "_nolimit_pcache";
            } else {
                str = "";
            }
            sb2.append(str);
            String sb3 = sb2.toString();
            int i11 = (80 - i10) / 2;
            w9Var.setLayoutParams(w7.x5.d(i10, i10, 49, 0.0f, i11 + 17, 0.0f, i11));
            w9Var.l(ImageLocation.getForDocument(document), sb3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), sb3, svgThumb, obj);
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        b();
    }

    public final void b() {
        int d;
        xh.f1 f1Var = this.f47572c;
        f1Var.f45815x = null;
        Integer num = this.h;
        le.c cVar = this.f47575r;
        TextView textView = this.f47573f;
        if (num != null) {
            d = org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false), org.telegram.ui.ActionBar.h6.l1(AndroidUtilities.lerp(0.15f, 1.0f, cVar.e), this.h.intValue()));
            f1Var.f45815x = this.h;
            this.f47571b.invalidate();
            textView.setTextColor(i0.a.d(cVar.e, this.h.intValue(), -1));
        } else if (this.f47576s) {
            int i10 = org.telegram.ui.ActionBar.h6.f18789d6;
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.h6.G6;
            int d10 = i0.a.d(cVar.e, i0.a.d(0.05f, w02, org.telegram.ui.ActionBar.h6.w0(null, i11, false)), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Oh, false));
            textView.setTextColor(i0.a.d(cVar.e, i0.a.d(0.5f, org.telegram.ui.ActionBar.h6.w0(null, i10, false), org.telegram.ui.ActionBar.h6.w0(null, i11, false)), -1));
            d = d10;
        } else {
            d = i0.a.d(0.5f, i0.a.k(this.v.f47483a.center_color, 255), i0.a.k(this.v.f47483a.pattern_color, 255));
            textView.setTextColor(-1);
        }
        if (textView.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) textView.getBackground()).getPaint().setColor(d);
            textView.invalidate();
        } else if (org.telegram.ui.ActionBar.h6.B1(textView.getBackground(), d, false)) {
            textView.invalidate();
        }
    }

    @Override
    public final void C(float f7, int i10) {
    }
}

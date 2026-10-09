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
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.y9;
public final class p0 extends FrameLayout implements me.d {
    public final org.telegram.ui.ActionBar.e6 f52978a;
    public final FrameLayout f52979b;
    public final xh.g1 f52980c;
    public final y9 d;
    public final TextView f52981e;
    public final TextView f52982f;
    public Integer h;
    public TLRPC.Document f52983n;
    public final me.b f52984r;
    public boolean f52985s;
    public n0 v;

    public p0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f52984r = new me.b(0, this, hs.h, 320L, false);
        this.f52978a = e6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f52979b = frameLayout;
        xh.g1 g1Var = new xh.g1(frameLayout, e6Var, true);
        this.f52980c = g1Var;
        frameLayout.setBackground(g1Var);
        g1Var.v = 1;
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        y9 y9Var = new y9(context);
        this.d = y9Var;
        y9Var.getImageReceiver().setAutoRepeat(0);
        addView(y9Var, w7.x5.a(80.0f, 0.0f, 17.0f, 0.0f, 0.0f, 80, 49));
        TextView textView = new TextView(context);
        this.f52981e = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        addView(textView, w7.x5.a(-2.0f, 12.0f, 106.0f, 12.0f, 14.0f, -1, 0));
        TextView textView2 = new TextView(context);
        this.f52982f = textView2;
        textView2.setClickable(false);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 11.0f);
        textView2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
        textView2.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(10.0f), 285212671));
        addView(textView2, w7.x5.a(-2.0f, 0.0f, 10.0f, 10.0f, 0.0f, -2, 53));
    }

    public static void a(p0 p0Var, TLRPC.Document document, int i10, Object obj, boolean z10) {
        String str;
        y9 y9Var = p0Var.d;
        if (document == null) {
            y9Var.b();
            p0Var.f52983n = null;
        } else if (p0Var.f52983n == document) {
        } else {
            p0Var.f52983n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.i6.f20741a7, 0.3f);
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
            y9Var.setLayoutParams(w7.x5.a(i10, 0.0f, i11 + 17, 0.0f, i11, i10, 49));
            y9Var.l(ImageLocation.getForDocument(document), sb3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), sb3, svgThumb, obj);
        }
    }

    public final void b() {
        int d;
        xh.g1 g1Var = this.f52980c;
        g1Var.f51246x = null;
        Integer num = this.h;
        me.b bVar = this.f52984r;
        TextView textView = this.f52982f;
        if (num != null) {
            d = org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false), org.telegram.ui.ActionBar.i6.m1(AndroidUtilities.lerp(0.15f, 1.0f, bVar.f16337e), this.h.intValue()));
            g1Var.f51246x = this.h;
            this.f52979b.invalidate();
            textView.setTextColor(i0.a.d(bVar.f16337e, this.h.intValue(), -1));
        } else if (this.f52985s) {
            int i10 = org.telegram.ui.ActionBar.i6.f20797d6;
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.i6.G6;
            int d10 = i0.a.d(bVar.f16337e, i0.a.d(0.05f, x02, org.telegram.ui.ActionBar.i6.x0(null, i11, false)), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false));
            textView.setTextColor(i0.a.d(bVar.f16337e, i0.a.d(0.5f, org.telegram.ui.ActionBar.i6.x0(null, i10, false), org.telegram.ui.ActionBar.i6.x0(null, i11, false)), -1));
            d = d10;
        } else {
            d = i0.a.d(0.5f, i0.a.k(this.v.f52912a.center_color, 255), i0.a.k(this.v.f52912a.pattern_color, 255));
            textView.setTextColor(-1);
        }
        if (textView.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) textView.getBackground()).getPaint().setColor(d);
            textView.invalidate();
        } else if (org.telegram.ui.ActionBar.i6.C1(textView.getBackground(), d, false)) {
            textView.invalidate();
        }
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        b();
    }

    @Override
    public final void A(float f7, int i10) {
    }
}

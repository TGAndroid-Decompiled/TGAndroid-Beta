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
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.y9;
public final class p0 extends FrameLayout implements me.d {
    public final org.telegram.ui.ActionBar.c6 f53216a;
    public final FrameLayout f53217b;
    public final xh.f1 f53218c;
    public final y9 d;
    public final TextView f53219e;
    public final TextView f53220f;
    public Integer h;
    public TLRPC.Document f53221n;
    public final me.b f53222r;
    public boolean f53223s;
    public n0 v;

    public p0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f53222r = new me.b(0, this, js.h, 320L, false);
        this.f53216a = c6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f53217b = frameLayout;
        xh.f1 f1Var = new xh.f1(frameLayout, c6Var, true);
        this.f53218c = f1Var;
        frameLayout.setBackground(f1Var);
        f1Var.v = 1;
        addView(frameLayout, w7.w5.e(-1, -1, 119));
        y9 y9Var = new y9(context);
        this.d = y9Var;
        y9Var.getImageReceiver().setAutoRepeat(0);
        addView(y9Var, w7.w5.a(80.0f, 0.0f, 17.0f, 0.0f, 0.0f, 80, 49));
        TextView textView = new TextView(context);
        this.f53219e = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        addView(textView, w7.w5.a(-2.0f, 12.0f, 106.0f, 12.0f, 14.0f, -1, 0));
        TextView textView2 = new TextView(context);
        this.f53220f = textView2;
        textView2.setClickable(false);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 11.0f);
        textView2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
        textView2.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(10.0f), 285212671));
        addView(textView2, w7.w5.a(-2.0f, 0.0f, 10.0f, 10.0f, 0.0f, -2, 53));
    }

    public static void a(p0 p0Var, TLRPC.Document document, int i10, Object obj, boolean z10) {
        String str;
        y9 y9Var = p0Var.d;
        if (document == null) {
            y9Var.b();
            p0Var.f53221n = null;
        } else if (p0Var.f53221n == document) {
        } else {
            p0Var.f53221n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.h6.f20504a7, 0.3f);
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
            y9Var.setLayoutParams(w7.w5.a(i10, 0.0f, i11 + 17, 0.0f, i11, i10, 49));
            y9Var.l(ImageLocation.getForDocument(document), sb3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), sb3, svgThumb, obj);
        }
    }

    public final void b() {
        int d;
        xh.f1 f1Var = this.f53218c;
        f1Var.f51469x = null;
        Integer num = this.h;
        me.b bVar = this.f53222r;
        TextView textView = this.f53220f;
        if (num != null) {
            d = org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, false), org.telegram.ui.ActionBar.h6.m1(AndroidUtilities.lerp(0.15f, 1.0f, bVar.f16088e), this.h.intValue()));
            f1Var.f51469x = this.h;
            this.f53217b.invalidate();
            textView.setTextColor(i0.a.d(bVar.f16088e, this.h.intValue(), -1));
        } else if (this.f53223s) {
            int i10 = org.telegram.ui.ActionBar.h6.f20560d6;
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.h6.G6;
            int d10 = i0.a.d(bVar.f16088e, i0.a.d(0.05f, x02, org.telegram.ui.ActionBar.h6.x0(null, i11, false)), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false));
            textView.setTextColor(i0.a.d(bVar.f16088e, i0.a.d(0.5f, org.telegram.ui.ActionBar.h6.x0(null, i10, false), org.telegram.ui.ActionBar.h6.x0(null, i11, false)), -1));
            d = d10;
        } else {
            d = i0.a.d(0.5f, i0.a.k(this.v.f53130a.center_color, 255), i0.a.k(this.v.f53130a.pattern_color, 255));
            textView.setTextColor(-1);
        }
        if (textView.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) textView.getBackground()).getPaint().setColor(d);
            textView.invalidate();
        } else if (org.telegram.ui.ActionBar.h6.C1(textView.getBackground(), d, false)) {
            textView.invalidate();
        }
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        b();
    }

    @Override
    public final void C(float f7, int i10) {
    }
}

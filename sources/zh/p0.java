package zh;

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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.z9;
public final class p0 extends FrameLayout implements ne.d {
    public final org.telegram.ui.ActionBar.c6 f50967a;
    public final FrameLayout f50968b;
    public final yh.e1 f50969c;
    public final z9 d;
    public final TextView e;
    public final TextView f50970f;
    public Integer h;
    public TLRPC.Document f50971n;
    public final ne.b f50972r;
    public boolean f50973s;
    public n0 v;

    public p0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f50972r = new ne.b(0, this, es.h, 320L, false);
        this.f50967a = c6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f50968b = frameLayout;
        yh.e1 e1Var = new yh.e1(frameLayout, c6Var, true);
        this.f50969c = e1Var;
        frameLayout.setBackground(e1Var);
        e1Var.v = 1;
        addView(frameLayout, w7.a6.e(-1, -1, 119));
        z9 z9Var = new z9(context);
        this.d = z9Var;
        z9Var.getImageReceiver().setAutoRepeat(0);
        addView(z9Var, w7.a6.a(80.0f, 0.0f, 17.0f, 0.0f, 0.0f, 80, 49));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        addView(textView, w7.a6.a(-2.0f, 12.0f, 106.0f, 12.0f, 14.0f, -1, 0));
        TextView textView2 = new TextView(context);
        this.f50970f = textView2;
        textView2.setClickable(false);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 11.0f);
        textView2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
        textView2.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(10.0f), 285212671));
        addView(textView2, w7.a6.a(-2.0f, 0.0f, 10.0f, 10.0f, 0.0f, -2, 53));
    }

    public static void a(p0 p0Var, TLRPC.Document document, int i10, Object obj, boolean z10) {
        String str;
        z9 z9Var = p0Var.d;
        if (document == null) {
            z9Var.b();
            p0Var.f50971n = null;
        } else if (p0Var.f50971n == document) {
        } else {
            p0Var.f50971n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.f19843a7, 0.3f);
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
            z9Var.setLayoutParams(w7.a6.a(i10, 0.0f, i11 + 17, 0.0f, i11, i10, 49));
            z9Var.l(ImageLocation.getForDocument(document), sb3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), sb3, svgThumb, obj);
        }
    }

    public final void b() {
        int d;
        yh.e1 e1Var = this.f50969c;
        e1Var.f48843x = null;
        Integer num = this.h;
        ne.b bVar = this.f50972r;
        TextView textView = this.f50970f;
        if (num != null) {
            d = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false), org.telegram.ui.ActionBar.g6.m1(AndroidUtilities.lerp(0.15f, 1.0f, bVar.e), this.h.intValue()));
            e1Var.f48843x = this.h;
            this.f50968b.invalidate();
            textView.setTextColor(i0.a.d(bVar.e, this.h.intValue(), -1));
        } else if (this.f50973s) {
            int i10 = org.telegram.ui.ActionBar.g6.f19901d6;
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.g6.G6;
            int d10 = i0.a.d(bVar.e, i0.a.d(0.05f, x02, org.telegram.ui.ActionBar.g6.x0(null, i11, false)), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Oh, false));
            textView.setTextColor(i0.a.d(bVar.e, i0.a.d(0.5f, org.telegram.ui.ActionBar.g6.x0(null, i10, false), org.telegram.ui.ActionBar.g6.x0(null, i11, false)), -1));
            d = d10;
        } else {
            d = i0.a.d(0.5f, i0.a.k(this.v.f50850a.center_color, 255), i0.a.k(this.v.f50850a.pattern_color, 255));
            textView.setTextColor(-1);
        }
        if (textView.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) textView.getBackground()).getPaint().setColor(d);
            textView.invalidate();
        } else if (org.telegram.ui.ActionBar.g6.C1(textView.getBackground(), d, false)) {
            textView.invalidate();
        }
    }

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        b();
    }

    @Override
    public final void C(float f7, int i10) {
    }
}

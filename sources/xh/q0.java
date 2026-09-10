package xh;

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
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wr;
public final class q0 extends FrameLayout implements le.d {
    public final org.telegram.ui.ActionBar.f6 f45901a;
    public final FrameLayout f45902b;
    public final wh.e1 f45903c;
    public final w9 d;
    public final TextView e;
    public final TextView f45904f;
    public Integer h;
    public TLRPC.Document f45905n;
    public final le.b f45906r;
    public boolean f45907s;
    public o0 v;

    public q0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f45906r = new le.b(0, this, wr.h, 320L, false);
        this.f45901a = f6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45902b = frameLayout;
        wh.e1 e1Var = new wh.e1(frameLayout, f6Var, true);
        this.f45903c = e1Var;
        frameLayout.setBackground(e1Var);
        e1Var.v = 1;
        addView(frameLayout, w7.a6.e(-1, -1, 119));
        w9 w9Var = new w9(context);
        this.d = w9Var;
        w9Var.getImageReceiver().setAutoRepeat(0);
        addView(w9Var, w7.a6.d(80, 80.0f, 49, 0.0f, 17.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        addView(textView, w7.a6.d(-1, -2.0f, 0, 12.0f, 106.0f, 12.0f, 14.0f));
        TextView textView2 = new TextView(context);
        this.f45904f = textView2;
        textView2.setClickable(false);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 11.0f);
        textView2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
        textView2.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(10.0f), 285212671));
        addView(textView2, w7.a6.d(-2, -2.0f, 53, 0.0f, 10.0f, 10.0f, 0.0f));
    }

    public static void a(q0 q0Var, TLRPC.Document document, int i10, Object obj, boolean z10) {
        String str;
        w9 w9Var = q0Var.d;
        if (document == null) {
            w9Var.b();
            q0Var.f45905n = null;
        } else if (q0Var.f45905n == document) {
        } else {
            q0Var.f45905n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.j6.f17872a7, 0.3f);
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
            w9Var.setLayoutParams(w7.a6.d(i10, i10, 49, 0.0f, i11 + 17, 0.0f, i11));
            w9Var.l(ImageLocation.getForDocument(document), sb3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), sb3, svgThumb, obj);
        }
    }

    @Override
    public final void G(int i10, float f7, float f10, le.e eVar) {
        b();
    }

    public final void b() {
        int d;
        wh.e1 e1Var = this.f45903c;
        e1Var.f44077x = null;
        Integer num = this.h;
        le.b bVar = this.f45906r;
        TextView textView = this.f45904f;
        if (num != null) {
            d = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false), org.telegram.ui.ActionBar.j6.l1(AndroidUtilities.lerp(0.15f, 1.0f, bVar.e), this.h.intValue()));
            e1Var.f44077x = this.h;
            this.f45902b.invalidate();
            textView.setTextColor(i0.a.d(bVar.e, this.h.intValue(), -1));
        } else if (this.f45907s) {
            int i10 = org.telegram.ui.ActionBar.j6.f17928d6;
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.j6.G6;
            int d10 = i0.a.d(bVar.e, i0.a.d(0.05f, w02, org.telegram.ui.ActionBar.j6.w0(null, i11, false)), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false));
            textView.setTextColor(i0.a.d(bVar.e, i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, i10, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false)), -1));
            d = d10;
        } else {
            d = i0.a.d(0.5f, i0.a.k(this.v.f45786a.center_color, 255), i0.a.k(this.v.f45786a.pattern_color, 255));
            textView.setTextColor(-1);
        }
        if (textView.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) textView.getBackground()).getPaint().setColor(d);
            textView.invalidate();
        } else if (org.telegram.ui.ActionBar.j6.B1(textView.getBackground(), d, false)) {
            textView.invalidate();
        }
    }

    @Override
    public final void B(float f7, int i10) {
    }
}

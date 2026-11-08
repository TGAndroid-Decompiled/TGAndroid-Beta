package th;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.g0;
import org.telegram.messenger.ij;
import org.telegram.messenger.t0;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.RadialProgress2;
public final class c extends sh.c {
    public final String f56046b;
    public final Uri f56047c;
    public final String d;
    public final long f56048e;
    public final String f56049f;
    public final Drawable h;
    public final StaticLayout f56050n;

    public c(String str) {
        long j3;
        this.f56046b = str;
        this.f56047c = null;
        File file = new File(str);
        try {
            j3 = file.length();
        } catch (Throwable unused) {
            j3 = 0;
        }
        this.f56048e = j3;
        String name = file.getName();
        this.d = name;
        String[] split = name.split("\\.");
        String str2 = split.length > 1 ? split[split.length - 1] : "?";
        this.f56049f = str2;
        int m12 = g0.m1(name, false);
        if (m12 != 0) {
            this.h = t0.f25566b.getResources().getDrawable(m12);
        } else {
            this.h = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(g0.L(13.0f));
            textPaint.setTypeface(g0.o());
            textPaint.setColor(k6.x0(null, k6.pj, false));
            this.f56050n = new StaticLayout(TextUtils.ellipsize(str2, textPaint, g0.L(34.0f), TextUtils.TruncateAt.END), textPaint, g0.L(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        this.f56050n = null;
    }

    public static b d(View view, String str, String str2, TLRPC.Document document, ij ijVar) {
        b bVar = new b();
        bVar.f56035a.setColor(k6.x0(null, k6.G6, false));
        bVar.f56036b.setColor(k6.x0(null, k6.f28244y6, false));
        bVar.d = true;
        RadialProgress2 radialProgress2 = new RadialProgress2(view, null);
        bVar.f56037c = radialProgress2;
        radialProgress2.setCircleRadius(g0.L(21.0f));
        bVar.f56037c.g(k6.We, k6.Xe, k6.f27950id, k6.f27968jd);
        if (ij.K3(document)) {
            if (ij.X2(document)) {
                TLRPC.PhotoSize w10 = w7.w(document.thumbs, g0.L(22.0f), true, null, false);
                bVar.f56037c.j(w7.w(document.thumbs, g0.L(44.0f), true, w10, true), w10, document, ijVar);
            } else {
                String t02 = ij.t0(document, true);
                if (!TextUtils.isEmpty(t02)) {
                    bVar.f56037c.h(t02);
                } else {
                    bVar.f56037c.i(null, null, null);
                }
            }
            bVar.f56037c.setIcon(0, false, false);
        } else {
            bVar.f56037c.setIcon(5, false, false);
        }
        if (str == null) {
            str = "";
        }
        bVar.f56038e = str;
        if (str2 == null) {
            str2 = "";
        }
        bVar.f56039f = str2;
        bVar.f56045m = -1;
        bVar.f56040g = null;
        bVar.h = null;
        bVar.invalidateSelf();
        view.addOnAttachStateChangeListener(new a(bVar));
        return bVar;
    }

    @Override
    public final void c(Canvas canvas, int i7, int i10) {
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setBounds(0, 0, i7, i10);
            drawable.draw(canvas);
            canvas.save();
            canvas.translate((i7 - g0.L(34.0f)) / 2.0f, g0.L(15.0f));
            this.f56050n.draw(canvas);
            canvas.restore();
        }
    }

    public c(Uri uri) {
        this.f56046b = null;
        this.f56047c = uri;
        String A = MediaController.A(uri);
        A = A == null ? "?" : A;
        this.d = A;
        String[] split = A.split("\\.");
        String str = split.length > 1 ? split[split.length - 1] : "?";
        this.f56049f = str;
        this.f56048e = 0L;
        int m12 = g0.m1(A, false);
        if (m12 != 0) {
            this.h = t0.f25566b.getResources().getDrawable(m12);
        } else {
            this.h = null;
        }
        if (!TextUtils.isEmpty(str)) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(g0.L(13.0f));
            textPaint.setTypeface(g0.o());
            textPaint.setColor(k6.x0(null, k6.pj, false));
            this.f56050n = new StaticLayout(TextUtils.ellipsize(str, textPaint, g0.L(34.0f), TextUtils.TruncateAt.END), textPaint, g0.L(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        this.f56050n = null;
    }
}

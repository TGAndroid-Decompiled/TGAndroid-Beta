package org.telegram.ui.web;

import ai.h4;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.AsyncTask;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import ci.b8;
import gi.e5;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.telegram.messenger.h10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d4;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.sm;
public final class l extends FrameLayout {
    public final j E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public float K;
    public boolean L;
    public org.telegram.ui.z M;
    public org.telegram.ui.q N;
    public org.telegram.ui.q O;
    public AsyncTask P;
    public final e5 f50925a;
    public boolean f50926b;
    public final org.telegram.ui.Cells.y f50927c;
    public final FrameLayout d;
    public final FrameLayout f50928e;
    public final ImageView f50929f;
    public final org.telegram.ui.Cells.y h;
    public final ImageView f50930n;
    public final TextView f50931r;
    public final TextView f50932s;
    public final sm f50933w;
    public final h4 f50934x;
    public final ArrayList f50935y;

    public l(Activity activity) {
        super(activity);
        int i3 = h10.f22829t0;
        this.f50935y = new ArrayList();
        this.K = 0.0f;
        setWillNotDraw(false);
        int i10 = h10.f22829t0;
        b bVar = new b(this, 0);
        a aVar = new a(this);
        e5 e5Var = new e5(2, null);
        this.f50925a = e5Var;
        h4 h4Var = new h4(this, activity, i10, bVar, aVar, e5Var);
        this.f50934x = h4Var;
        h4Var.f35594g3.f33698r = false;
        h4Var.setOverScrollMode(2);
        h4Var.setPadding(0, 0, 0, 0);
        addView(h4Var, mf.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f50928e = frameLayout2;
        org.telegram.ui.Cells.y b02 = k6.b0(this.H, this.J, 15, 15);
        this.f50927c = b02;
        frameLayout2.setBackground(b02);
        pf.b(frameLayout2, 0.04f, 1.25f);
        frameLayout.addView(frameLayout2, mf.d(-1, -2.0f, 7, 12.0f, 0.0f, 12.0f, 15.0f));
        ImageView imageView = new ImageView(activity);
        this.f50929f = imageView;
        frameLayout2.addView(imageView, mf.d(24, 24.0f, 19, 16.0f, 16.0f, 16.0f, 16.0f));
        ImageView imageView2 = new ImageView(activity);
        this.f50930n = imageView2;
        pf.a(imageView2);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131232103);
        org.telegram.ui.Cells.y b03 = k6.b0(0, 0, 6, 6);
        this.h = b03;
        imageView2.setBackground(b03);
        frameLayout2.addView(imageView2, mf.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout, mf.d(-1, -2.0f, 16, 54.0f, 9.0f, 54.0f, 9.0f));
        TextView textView = new TextView(activity);
        this.f50931r = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setMaxLines(4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, mf.t(-1, -2, 55, 0, 0, 0, 2));
        TextView textView2 = new TextView(activity);
        this.f50932s = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        linearLayout.addView(textView2, mf.t(-1, -2, 55, 0, 0, 0, 0));
        this.E = new j(null, i3, new d4(this, 16));
        this.f50933w = new sm(activity, 28);
        int i11 = k6.Dl;
        c(k6.x0(null, i11, false), org.telegram.messenger.g0.B(k6.x0(null, i11, false)) >= 0.721f ? -16777216 : -1);
        setOpenProgress(0.0f);
        setImportantForAccessibility(4);
    }

    public static String a(zi ziVar) {
        TLRPC.Message message = ziVar.f26868k;
        if (message != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                return messageMedia.webpage.url;
            }
        }
        CharSequence charSequence = ziVar.v;
        if (charSequence != null && charSequence.length() > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ziVar.v);
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                String url = uRLSpan.getURL();
                if (url != null && !url.startsWith("@") && !url.startsWith("#") && !url.startsWith("$")) {
                    return url;
                }
            }
            return null;
        }
        return null;
    }

    public static void b(android.content.Context r15, java.lang.String r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.l.b(android.content.Context, java.lang.String):void");
    }

    public final void c(int i3, int i10) {
        float f10;
        if (this.F != i3) {
            this.F = i3;
            invalidate();
        }
        this.I = i10;
        if (org.telegram.messenger.g0.B(i3) >= 0.721f) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.H = i0.a.f(org.telegram.messenger.g0.T1(0.05f, 0.12f, f10), i3, i10);
        this.G = i3;
        this.J = i0.a.f(org.telegram.messenger.g0.T1(0.12f, 0.22f, f10), i3, i10);
        int i11 = this.H;
        org.telegram.ui.Cells.y yVar = this.f50927c;
        k6.H1(yVar, i11, false);
        k6.H1(yVar, this.J, true);
        this.f50928e.invalidate();
        this.f50931r.setTextColor(i10);
        this.f50932s.setTextColor(k6.r1(0.6f, i10));
        ImageView imageView = this.f50929f;
        if (imageView.getColorFilter() != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        this.f50930n.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        k6.H1(this.h, k6.r1(1.5f, this.J), true);
        int w10 = k6.w(i3, k6.r1(0.05f, i10));
        int w11 = k6.w(i3, k6.r1(0.55f, i10));
        e5 e5Var = this.f50925a;
        SparseIntArray sparseIntArray = (SparseIntArray) e5Var.f12662b;
        ((SparseIntArray) e5Var.f12662b).put(k6.f27878d6, this.G);
        sparseIntArray.put(k6.G6, i10);
        sparseIntArray.put(k6.f27899e7, w10);
        sparseIntArray.put(k6.f27918f7, w11);
        sparseIntArray.put(k6.G8, k6.r1(0.2f, i10));
        sparseIntArray.put(k6.f27972i6, k6.r1(org.telegram.messenger.g0.T1(0.05f, 0.12f, f10), i10));
        this.f50934x.g1();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), getHeight() * this.K);
        canvas.drawColor(this.G);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.K < 0.3f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        j jVar = this.E;
        if (jVar != null && this.L) {
            jVar.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.E;
        if (jVar != null) {
            jVar.c();
        }
    }

    public void setInput(String str) {
        AsyncTask asyncTask = this.P;
        String str2 = null;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.P = null;
        }
        ArrayList arrayList = this.f50935y;
        boolean z10 = !arrayList.isEmpty();
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            h4 h4Var = this.f50934x;
            h4Var.f35594g3.O(true);
            if (z10 != (!arrayList.isEmpty())) {
                h4Var.f35593f3.h1(0, 0);
                return;
            }
            return;
        }
        z0 z0Var = new z0(new b8(9, this, z10));
        String str3 = d1.a().f50831c;
        if (str3 != null) {
            StringBuilder l10 = com.google.android.recaptcha.internal.a.l(str3);
            l10.append(URLEncoder.encode(str));
            str2 = l10.toString();
        }
        this.P = z0Var.execute(str2);
    }

    public void setOpenProgress(float f10) {
        int i3;
        if (Math.abs(this.K - f10) > 1.0E-4f) {
            this.K = f10;
            if (f10 <= 1.0E-4f) {
                i3 = 4;
            } else {
                i3 = 0;
            }
            if (getImportantForAccessibility() != i3) {
                setImportantForAccessibility(i3);
            }
            invalidate();
        }
    }

    public void setOpened(boolean z10) {
        boolean z11;
        j jVar = this.E;
        if (z10 && jVar != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.L = z11;
        if (z11) {
            jVar.a();
        }
    }
}

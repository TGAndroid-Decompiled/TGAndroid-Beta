package org.telegram.ui.web;

import ai.u2;
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
import bi.v3;
import c8.ja;
import c8.na;
import com.google.android.gms.internal.vision.e2;
import hi.e5;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.bn;
public final class k extends FrameLayout {
    public final i E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public float K;
    public boolean L;
    public org.telegram.ui.x M;
    public org.telegram.ui.q N;
    public org.telegram.ui.q O;
    public AsyncTask P;
    public final e5 f52683a;
    public boolean f52684b;
    public final org.telegram.ui.Cells.y f52685c;
    public final FrameLayout d;
    public final FrameLayout f52686e;
    public final ImageView f52687f;
    public final org.telegram.ui.Cells.y h;
    public final ImageView f52688n;
    public final TextView f52689r;
    public final TextView f52690s;
    public final bn f52691w;
    public final v3 f52692x;
    public final ArrayList f52693y;

    public k(Activity activity) {
        super(activity);
        int i7 = m10.f24940t0;
        this.f52693y = new ArrayList();
        this.K = 0.0f;
        setWillNotDraw(false);
        int i10 = m10.f24940t0;
        b bVar = new b(this, 0);
        a aVar = new a(this);
        e5 e5Var = new e5(2, null);
        this.f52683a = e5Var;
        v3 v3Var = new v3(this, activity, i10, bVar, aVar, e5Var);
        this.f52692x = v3Var;
        v3Var.f39892g3.f38199r = false;
        v3Var.setOverScrollMode(2);
        v3Var.setPadding(0, 0, 0, 0);
        addView(v3Var, ja.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f52686e = frameLayout2;
        org.telegram.ui.Cells.y b02 = j6.b0(this.H, this.J, 15, 15);
        this.f52685c = b02;
        frameLayout2.setBackground(b02);
        na.b(frameLayout2, 0.04f, 1.25f);
        frameLayout.addView(frameLayout2, ja.d(-1, -2.0f, 7, 12.0f, 0.0f, 12.0f, 15.0f));
        ImageView imageView = new ImageView(activity);
        this.f52687f = imageView;
        frameLayout2.addView(imageView, ja.d(24, 24.0f, 19, 16.0f, 16.0f, 16.0f, 16.0f));
        ImageView imageView2 = new ImageView(activity);
        this.f52688n = imageView2;
        na.a(imageView2);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131232104);
        org.telegram.ui.Cells.y b03 = j6.b0(0, 0, 6, 6);
        this.h = b03;
        imageView2.setBackground(b03);
        frameLayout2.addView(imageView2, ja.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout, ja.d(-1, -2.0f, 16, 54.0f, 9.0f, 54.0f, 9.0f));
        TextView textView = new TextView(activity);
        this.f52689r = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setMaxLines(4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, ja.t(-1, -2, 55, 0, 0, 0, 2));
        TextView textView2 = new TextView(activity);
        this.f52690s = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        linearLayout.addView(textView2, ja.t(-1, -2, 55, 0, 0, 0, 0));
        this.E = new i(null, i7, new org.telegram.ui.ActionBar.r0(this, 22));
        this.f52691w = new bn(activity, 27);
        int i11 = j6.Gl;
        c(j6.x0(null, i11, false), org.telegram.messenger.g0.B(j6.x0(null, i11, false)) >= 0.721f ? -16777216 : -1);
        setOpenProgress(0.0f);
        setImportantForAccessibility(4);
    }

    public static String a(gj gjVar) {
        TLRPC.Message message = gjVar.f23819k;
        if (message != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                return messageMedia.webpage.url;
            }
        }
        CharSequence charSequence = gjVar.v;
        if (charSequence != null && charSequence.length() > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gjVar.v);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.k.b(android.content.Context, java.lang.String):void");
    }

    public final void c(int i7, int i10) {
        float f10;
        if (this.F != i7) {
            this.F = i7;
            invalidate();
        }
        this.I = i10;
        if (org.telegram.messenger.g0.B(i7) >= 0.721f) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.H = i0.a.f(org.telegram.messenger.g0.T1(0.05f, 0.12f, f10), i7, i10);
        this.G = i7;
        this.J = i0.a.f(org.telegram.messenger.g0.T1(0.12f, 0.22f, f10), i7, i10);
        int i11 = this.H;
        org.telegram.ui.Cells.y yVar = this.f52685c;
        j6.H1(yVar, i11, false);
        j6.H1(yVar, this.J, true);
        this.f52686e.invalidate();
        this.f52689r.setTextColor(i10);
        this.f52690s.setTextColor(j6.r1(0.6f, i10));
        ImageView imageView = this.f52687f;
        if (imageView.getColorFilter() != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        this.f52688n.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        j6.H1(this.h, j6.r1(1.5f, this.J), true);
        int w10 = j6.w(i7, j6.r1(0.05f, i10));
        int w11 = j6.w(i7, j6.r1(0.55f, i10));
        e5 e5Var = this.f52683a;
        SparseIntArray sparseIntArray = (SparseIntArray) e5Var.f14240b;
        ((SparseIntArray) e5Var.f14240b).put(j6.f28849d6, this.G);
        sparseIntArray.put(j6.G6, i10);
        sparseIntArray.put(j6.f28869e7, w10);
        sparseIntArray.put(j6.f28888f7, w11);
        sparseIntArray.put(j6.G8, j6.r1(0.2f, i10));
        sparseIntArray.put(j6.f28941i6, j6.r1(org.telegram.messenger.g0.T1(0.05f, 0.12f, f10), i10));
        this.f52692x.g1();
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
        i iVar = this.E;
        if (iVar != null && this.L) {
            iVar.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.E;
        if (iVar != null) {
            iVar.c();
        }
    }

    public void setInput(String str) {
        AsyncTask asyncTask = this.P;
        String str2 = null;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.P = null;
        }
        ArrayList arrayList = this.f52693y;
        boolean z10 = !arrayList.isEmpty();
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            v3 v3Var = this.f52692x;
            v3Var.f39892g3.O(true);
            if (z10 != (!arrayList.isEmpty())) {
                v3Var.f39891f3.h1(0, 0);
                return;
            }
            return;
        }
        y0 y0Var = new y0(new u2(10, this, z10));
        String str3 = d1.a().f52591c;
        if (str3 != null) {
            StringBuilder m10 = e2.m(str3);
            m10.append(URLEncoder.encode(str));
            str2 = m10.toString();
        }
        this.P = y0Var.execute(str2);
    }

    public void setOpenProgress(float f10) {
        int i7;
        if (Math.abs(this.K - f10) > 1.0E-4f) {
            this.K = f10;
            if (f10 <= 1.0E-4f) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            if (getImportantForAccessibility() != i7) {
                setImportantForAccessibility(i7);
            }
            invalidate();
        }
    }

    public void setOpened(boolean z10) {
        boolean z11;
        i iVar = this.E;
        if (z10 && iVar != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.L = z11;
        if (z11) {
            iVar.a();
        }
    }
}

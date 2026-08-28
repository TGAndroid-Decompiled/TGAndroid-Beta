package org.telegram.ui.web;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
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
import g7.e6;
import g7.g6;
import gh.p6;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import kh.b8;
import mh.m2;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.jn0;
public final class k extends FrameLayout {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public float F;
    public boolean G;
    public org.telegram.ui.a0 H;
    public org.telegram.ui.r I;
    public org.telegram.ui.r J;
    public AsyncTask K;
    public final e3 f43905a;
    public boolean f43906b;
    public final org.telegram.ui.Cells.z f43907c;
    public final FrameLayout d;
    public final FrameLayout f43908e;
    public final ImageView f43909f;
    public final org.telegram.ui.Cells.z h;
    public final ImageView f43910n;
    public final TextView f43911r;
    public final TextView f43912s;
    public final an v;
    public final c f43913w;
    public final ArrayList f43914x;
    public final i f43915y;

    public k(Activity activity) {
        super(activity);
        int i9 = UserConfig.selectedAccount;
        this.f43914x = new ArrayList();
        this.F = 0.0f;
        setWillNotDraw(false);
        int i10 = UserConfig.selectedAccount;
        b8 b8Var = new b8(this, 14);
        a aVar = new a(this);
        e3 e3Var = new e3((b6) null);
        this.f43905a = e3Var;
        c cVar = new c(this, activity, i10, b8Var, aVar, e3Var);
        this.f43913w = cVar;
        cVar.U2.f35188r = false;
        cVar.setOverScrollMode(2);
        cVar.setPadding(0, 0, 0, 0);
        addView(cVar, e6.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f43908e = frameLayout2;
        org.telegram.ui.Cells.z Z = f6.Z(this.C, this.E, 15, 15);
        this.f43907c = Z;
        frameLayout2.setBackground(Z);
        g6.b(frameLayout2, 0.04f, 1.25f);
        frameLayout.addView(frameLayout2, e6.d(-1, -2.0f, 7, 12.0f, 0.0f, 12.0f, 15.0f));
        ImageView imageView = new ImageView(activity);
        this.f43909f = imageView;
        frameLayout2.addView(imageView, e6.d(24, 24.0f, 19, 16.0f, 16.0f, 16.0f, 16.0f));
        ImageView imageView2 = new ImageView(activity);
        this.f43910n = imageView2;
        g6.a(imageView2);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.msg_copy);
        org.telegram.ui.Cells.z Z2 = f6.Z(0, 0, 6, 6);
        this.h = Z2;
        imageView2.setBackground(Z2);
        frameLayout2.addView(imageView2, e6.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout, e6.d(-1, -2.0f, 16, 54.0f, 9.0f, 54.0f, 9.0f));
        TextView textView = new TextView(activity);
        this.f43911r = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, e6.t(-1, -2, 55, 0, 0, 0, 2));
        TextView textView2 = new TextView(activity);
        this.f43912s = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        linearLayout.addView(textView2, e6.t(-1, -2, 55, 0, 0, 0, 0));
        this.f43915y = new i(null, i9, new m2(this, 14));
        this.v = new an(activity, 29);
        int i11 = f6.Pk;
        c(f6.w0(null, i11, false), AndroidUtilities.computePerceivedBrightness(f6.w0(null, i11, false)) >= 0.721f ? -16777216 : -1);
        setOpenProgress(0.0f);
        setImportantForAccessibility(4);
    }

    public static String a(MessageObject messageObject) {
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                return messageMedia.webpage.url;
            }
        }
        CharSequence charSequence = messageObject.messageText;
        if (charSequence != null && charSequence.length() > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(messageObject.messageText);
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

    public static void b(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("webhistory", 0);
        j jVar = null;
        String string = sharedPreferences.getString("queries_json", null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i9);
                    j jVar2 = new j(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                    jVar2.f43899c = jSONObject.optDouble("rank", 0.0d);
                    arrayList.add(jVar2);
                }
                Collections.sort(arrayList, new jn0(20));
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        int i10 = 0;
        while (true) {
            try {
                if (i10 >= arrayList.size()) {
                    break;
                }
                j jVar3 = (j) arrayList.get(i10);
                if (TextUtils.equals(jVar3.f43897a, str)) {
                    jVar = jVar3;
                    break;
                }
                i10++;
            } catch (Exception e11) {
                FileLog.e(e11);
                return;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (jVar != null) {
            jVar.f43899c += Math.exp((currentTimeMillis - jVar.f43898b) / 2419200.0d);
        } else {
            jVar = new j(str, currentTimeMillis);
            arrayList.add(jVar);
        }
        jVar.f43898b = currentTimeMillis;
        JSONArray jSONArray2 = new JSONArray();
        for (int i11 = 0; i11 < Math.min(arrayList.size(), 20); i11++) {
            j jVar4 = (j) arrayList.get(i11);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", jVar4.f43897a);
            jSONObject2.put("rank", jVar4.f43899c);
            jSONObject2.put("usage", jVar4.f43898b);
            jSONArray2.put(jSONObject2);
        }
        sharedPreferences.edit().putString("queries_json", jSONArray2.toString()).apply();
    }

    public final void c(int i9, int i10) {
        float f10;
        if (this.A != i9) {
            this.A = i9;
            invalidate();
        }
        this.D = i10;
        if (AndroidUtilities.computePerceivedBrightness(i9) >= 0.721f) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.C = i0.a.d(AndroidUtilities.lerp(0.05f, 0.12f, f10), i9, i10);
        this.B = i9;
        this.E = i0.a.d(AndroidUtilities.lerp(0.12f, 0.22f, f10), i9, i10);
        int i11 = this.C;
        org.telegram.ui.Cells.z zVar = this.f43907c;
        f6.B1(zVar, i11, false);
        f6.B1(zVar, this.E, true);
        this.f43908e.invalidate();
        this.f43911r.setTextColor(i10);
        this.f43912s.setTextColor(f6.l1(0.6f, i10));
        ImageView imageView = this.f43909f;
        if (imageView.getColorFilter() != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        this.f43910n.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        f6.B1(this.h, f6.l1(1.5f, this.E), true);
        int v = f6.v(i9, f6.l1(0.05f, i10));
        int v4 = f6.v(i9, f6.l1(0.55f, i10));
        e3 e3Var = this.f43905a;
        SparseIntArray sparseIntArray = (SparseIntArray) e3Var.f24286b;
        ((SparseIntArray) e3Var.f24286b).put(f6.f23001d6, this.B);
        sparseIntArray.put(f6.G6, i10);
        sparseIntArray.put(f6.f23020e7, v);
        sparseIntArray.put(f6.f23038f7, v4);
        sparseIntArray.put(f6.G8, f6.l1(0.2f, i10));
        sparseIntArray.put(f6.f23092i6, f6.l1(AndroidUtilities.lerp(0.05f, 0.12f, f10), i10));
        this.f43913w.f1();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), getHeight() * this.F);
        canvas.drawColor(this.B);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.F < 0.3f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i iVar = this.f43915y;
        if (iVar != null && this.G) {
            iVar.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.f43915y;
        if (iVar != null) {
            iVar.c();
        }
    }

    public void setInput(String str) {
        AsyncTask asyncTask = this.K;
        String str2 = null;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.K = null;
        }
        ArrayList arrayList = this.f43914x;
        boolean z10 = !arrayList.isEmpty();
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            c cVar = this.f43913w;
            cVar.U2.N(true);
            if (z10 != (!arrayList.isEmpty())) {
                cVar.T2.h1(0, 0);
                return;
            }
            return;
        }
        e1 e1Var = new e1(new p6(5, this, z10));
        String str3 = j1.a().f43904c;
        if (str3 != null) {
            StringBuilder n10 = e2.c.n(str3);
            n10.append(URLEncoder.encode(str));
            str2 = n10.toString();
        }
        this.K = e1Var.execute(str2);
    }

    public void setOpenProgress(float f10) {
        int i9;
        if (Math.abs(this.F - f10) > 1.0E-4f) {
            this.F = f10;
            if (f10 <= 1.0E-4f) {
                i9 = 4;
            } else {
                i9 = 0;
            }
            if (getImportantForAccessibility() != i9) {
                setImportantForAccessibility(i9);
            }
            invalidate();
        }
    }

    public void setOpened(boolean z10) {
        boolean z11;
        i iVar = this.f43915y;
        if (z10 && iVar != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.G = z11;
        if (z11) {
            iVar.a();
        }
    }
}

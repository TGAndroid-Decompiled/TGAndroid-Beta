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
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import k7.c6;
import k7.e6;
import mh.m6;
import n7.qa;
import oh.t3;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.in;
import org.telegram.ui.du;
public final class k extends FrameLayout {
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public float G;
    public boolean H;
    public org.telegram.ui.a0 I;
    public org.telegram.ui.t J;
    public org.telegram.ui.t K;
    public AsyncTask L;
    public final qa f42566a;
    public boolean f42567b;
    public final org.telegram.ui.Cells.z f42568c;
    public final FrameLayout d;
    public final FrameLayout f42569e;
    public final ImageView f42570f;
    public final org.telegram.ui.Cells.z h;
    public final ImageView f42571n;
    public final TextView f42572r;
    public final TextView f42573s;
    public final in v;
    public final c f42574w;
    public final ArrayList f42575x;
    public final i f42576y;

    public k(Activity activity) {
        super(activity);
        int i10 = UserConfig.selectedAccount;
        this.f42575x = new ArrayList();
        this.G = 0.0f;
        setWillNotDraw(false);
        int i11 = UserConfig.selectedAccount;
        eg.p1 p1Var = new eg.p1(this, 24);
        a aVar = new a(this);
        qa qaVar = new qa((g6) null);
        this.f42566a = qaVar;
        c cVar = new c(this, activity, i11, p1Var, aVar, qaVar);
        this.f42574w = cVar;
        cVar.V2.f32651r = false;
        cVar.setOverScrollMode(2);
        cVar.setPadding(0, 0, 0, 0);
        addView(cVar, c6.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f42569e = frameLayout2;
        org.telegram.ui.Cells.z Z = k6.Z(this.D, this.F, 15, 15);
        this.f42568c = Z;
        frameLayout2.setBackground(Z);
        e6.b(frameLayout2, 0.04f, 1.25f);
        frameLayout.addView(frameLayout2, c6.d(-1, -2.0f, 7, 12.0f, 0.0f, 12.0f, 15.0f));
        ImageView imageView = new ImageView(activity);
        this.f42570f = imageView;
        frameLayout2.addView(imageView, c6.d(24, 24.0f, 19, 16.0f, 16.0f, 16.0f, 16.0f));
        ImageView imageView2 = new ImageView(activity);
        this.f42571n = imageView2;
        e6.a(imageView2);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.msg_copy);
        org.telegram.ui.Cells.z Z2 = k6.Z(0, 0, 6, 6);
        this.h = Z2;
        imageView2.setBackground(Z2);
        frameLayout2.addView(imageView2, c6.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout, c6.d(-1, -2.0f, 16, 54.0f, 9.0f, 54.0f, 9.0f));
        TextView textView = new TextView(activity);
        this.f42572r = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, c6.t(-1, -2, 55, 0, 0, 0, 2));
        TextView textView2 = new TextView(activity);
        this.f42573s = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        linearLayout.addView(textView2, c6.t(-1, -2, 55, 0, 0, 0, 0));
        this.f42576y = new i(null, i10, new t3(this, 27));
        this.v = new in(activity, 25);
        int i12 = k6.Pk;
        c(k6.w0(null, i12, false), AndroidUtilities.computePerceivedBrightness(k6.w0(null, i12, false)) >= 0.721f ? -16777216 : -1);
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
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    j jVar2 = new j(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                    jVar2.f42558c = jSONObject.optDouble("rank", 0.0d);
                    arrayList.add(jVar2);
                }
                Collections.sort(arrayList, new du(15));
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        int i11 = 0;
        while (true) {
            try {
                if (i11 >= arrayList.size()) {
                    break;
                }
                j jVar3 = (j) arrayList.get(i11);
                if (TextUtils.equals(jVar3.f42556a, str)) {
                    jVar = jVar3;
                    break;
                }
                i11++;
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (jVar != null) {
            jVar.f42558c += Math.exp((currentTimeMillis - jVar.f42557b) / 2419200.0d);
        } else {
            jVar = new j(str, currentTimeMillis);
            arrayList.add(jVar);
        }
        jVar.f42557b = currentTimeMillis;
        JSONArray jSONArray2 = new JSONArray();
        for (int i12 = 0; i12 < Math.min(arrayList.size(), 20); i12++) {
            j jVar4 = (j) arrayList.get(i12);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", jVar4.f42556a);
            jSONObject2.put("rank", jVar4.f42558c);
            jSONObject2.put("usage", jVar4.f42557b);
            jSONArray2.put(jSONObject2);
        }
        sharedPreferences.edit().putString("queries_json", jSONArray2.toString()).apply();
    }

    public final void c(int i10, int i11) {
        float f10;
        if (this.B != i10) {
            this.B = i10;
            invalidate();
        }
        this.E = i11;
        if (AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.D = i0.a.d(AndroidUtilities.lerp(0.05f, 0.12f, f10), i10, i11);
        this.C = i10;
        this.F = i0.a.d(AndroidUtilities.lerp(0.12f, 0.22f, f10), i10, i11);
        int i12 = this.D;
        org.telegram.ui.Cells.z zVar = this.f42568c;
        k6.B1(zVar, i12, false);
        k6.B1(zVar, this.F, true);
        this.f42569e.invalidate();
        this.f42572r.setTextColor(i11);
        this.f42573s.setTextColor(k6.l1(0.6f, i11));
        ImageView imageView = this.f42570f;
        if (imageView.getColorFilter() != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
        this.f42571n.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        k6.B1(this.h, k6.l1(1.5f, this.F), true);
        int v = k6.v(i10, k6.l1(0.05f, i11));
        int v10 = k6.v(i10, k6.l1(0.55f, i11));
        qa qaVar = this.f42566a;
        SparseIntArray sparseIntArray = (SparseIntArray) qaVar.f15701b;
        ((SparseIntArray) qaVar.f15701b).put(k6.f21661d6, this.C);
        sparseIntArray.put(k6.G6, i11);
        sparseIntArray.put(k6.f21680e7, v);
        sparseIntArray.put(k6.f21699f7, v10);
        sparseIntArray.put(k6.G8, k6.l1(0.2f, i11));
        sparseIntArray.put(k6.f21752i6, k6.l1(AndroidUtilities.lerp(0.05f, 0.12f, f10), i11));
        this.f42574w.e1();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), getHeight() * this.G);
        canvas.drawColor(this.C);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.G < 0.3f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i iVar = this.f42576y;
        if (iVar != null && this.H) {
            iVar.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.f42576y;
        if (iVar != null) {
            iVar.c();
        }
    }

    public void setInput(String str) {
        AsyncTask asyncTask = this.L;
        String str2 = null;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.L = null;
        }
        ArrayList arrayList = this.f42575x;
        boolean z4 = !arrayList.isEmpty();
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            c cVar = this.f42574w;
            cVar.V2.N(true);
            if (z4 != (!arrayList.isEmpty())) {
                cVar.U2.h1(0, 0);
                return;
            }
            return;
        }
        h1 h1Var = new h1(new m6(3, this, z4));
        String str3 = m1.a().f42603c;
        if (str3 != null) {
            StringBuilder l10 = e2.c.l(str3);
            l10.append(URLEncoder.encode(str));
            str2 = l10.toString();
        }
        this.L = h1Var.execute(str2);
    }

    public void setOpenProgress(float f10) {
        int i10;
        if (Math.abs(this.G - f10) > 1.0E-4f) {
            this.G = f10;
            if (f10 <= 1.0E-4f) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            if (getImportantForAccessibility() != i10) {
                setImportantForAccessibility(i10);
            }
            invalidate();
        }
    }

    public void setOpened(boolean z4) {
        boolean z10;
        i iVar = this.f42576y;
        if (z4 && iVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.H = z10;
        if (z10) {
            iVar.a();
        }
    }
}

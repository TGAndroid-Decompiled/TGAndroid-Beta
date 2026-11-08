package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class yz extends FrameLayout implements org.telegram.ui.ActionBar.a6, org.telegram.messenger.ls, te.b {
    public static final SpannableStringBuilder[] f52357s0 = new SpannableStringBuilder[3];
    public jg.o0 D;
    public long E;
    public long F;
    public long G;
    public long H;
    public String I;
    public boolean J;
    public final Activity K;
    public final org.telegram.ui.ActionBar.f2 L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public String Q;
    public int R;
    public final rz S;
    public final sz T;
    public final wz U;
    public final tz V;
    public final vz W;
    public final te.a f52358a;
    public final tz f52359a0;
    public final zs f52360b;
    public final tz f52361b0;
    public final org.telegram.ui.Components.av0 f52362c;
    public final ArrayList f52363c0;
    public org.telegram.ui.Components.oj0 d;
    public final ArrayList f52364d0;
    public iz f52365e;
    public boolean f52366e0;
    public final ArrayList f52367f;
    public final m4 f52368f0;
    public final lz f52369g0;
    public final SparseArray h;
    public pz f52370h0;
    public org.telegram.ui.Components.bm0 f52371i0;
    public final v4.b0 f52372j0;
    public final mz f52373k0;
    public final h2.f f52374l0;
    public final qz m0;
    public final ArrayList f52375n;
    public final hz f52376n0;
    public xz f52377o0;
    public boolean f52378p0;
    public int f52379q0;
    public final HashMap f52380r;
    public boolean f52381r0;
    public int f52382s;
    public int f52383w;
    public String f52384x;
    public String f52385y;

    public yz(org.telegram.ui.ActionBar.f2 f2Var) {
        super(f2Var.getParentActivity());
        this.f52358a = new te.a(0, this, org.telegram.ui.Components.xq.h, 380L, false);
        this.f52367f = new ArrayList();
        this.h = new SparseArray();
        this.f52375n = new ArrayList();
        this.f52380r = new HashMap();
        this.f52382s = 3;
        this.S = new rz(0, 0L);
        this.f52363c0 = new ArrayList();
        this.f52364d0 = new ArrayList();
        this.f52368f0 = new m4(this, 5);
        this.f52369g0 = new lz(this);
        this.f52374l0 = new h2.f((int[]) null);
        this.f52376n0 = new hz(this, 0);
        this.L = f2Var;
        Activity parentActivity = f2Var.getParentActivity();
        this.K = parentActivity;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, this, null);
        zs zsVar = new zs(2, parentActivity, this);
        this.f52360b = zsVar;
        zsVar.setOnItemClickListener(new h(this, 12));
        zsVar.setOnItemLongClickListener(new f(this, 15));
        v4.b0 b0Var = new v4.b0();
        this.f52372j0 = b0Var;
        zsVar.setLayoutManager(b0Var);
        mz mzVar = new mz(0, parentActivity, this);
        this.f52373k0 = mzVar;
        addView(mzVar);
        addView(zsVar);
        zsVar.setSectionsType(2);
        zsVar.setSkipDrawSection(true);
        zsVar.setOnScrollListener(new nz(this));
        qz qzVar = new qz(parentActivity);
        this.m0 = qzVar;
        String u10 = org.telegram.messenger.id.u((int) (System.currentTimeMillis() / 1000), false);
        if (!TextUtils.equals(qzVar.f49338c, u10)) {
            qzVar.f49338c = u10;
            qzVar.f49336a.t(u10, true, true);
        }
        addView(qzVar, c8.ha.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.T = new sz(this);
        this.U = new wz(this, getContext());
        this.V = new tz(this, getContext(), 1);
        this.W = new vz(this, getContext());
        this.f52359a0 = new tz(this, getContext(), 4);
        this.f52361b0 = new tz(this, getContext(), 2);
        org.telegram.ui.Components.av0 av0Var = new org.telegram.ui.Components.av0(parentActivity, mzVar, 1, null);
        this.f52362c = av0Var;
        addView(av0Var);
        zsVar.setEmptyView(av0Var);
        av0Var.setVisibility(8);
        b();
    }

    public static void a(yz yzVar, org.telegram.messenger.ij ijVar, View view, int i7) {
        if (!yzVar.f52377o0.i()) {
            yzVar.f52377o0.e();
        }
        if (yzVar.f52377o0.i()) {
            yzVar.f52377o0.h(ijVar, view, i7);
        }
    }

    public static CharSequence c(org.telegram.messenger.ij ijVar, boolean z9) {
        return d(ijVar, z9, 0, null);
    }

    public static CharSequence d(org.telegram.messenger.ij ijVar, boolean z9, int i7, TextPaint textPaint) {
        TLRPC.Message message;
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        TLRPC.User user2;
        Paint.FontMetricsInt fontMetricsInt;
        TLRPC.TL_forumTopic f10;
        Paint.FontMetricsInt fontMetricsInt2;
        Paint.FontMetricsInt fontMetricsInt3;
        Paint.FontMetricsInt fontMetricsInt4;
        TLRPC.TL_forumTopic f11;
        int i10;
        int i11;
        if (ijVar != null && (message = ijVar.f23262k) != null) {
            if (org.telegram.messenger.ij.c4(message)) {
                kg.s1 c10 = kg.t1.f(ijVar.I1).c(org.telegram.messenger.ij.J1(ijVar.f23262k));
                if (c10 != null) {
                    return c10.f17533b;
                }
                return "";
            }
            CharSequence charSequence = null;
            if (ijVar.s4()) {
                if (ijVar.Z0) {
                    return org.telegram.messenger.id.M0(2131745261, null);
                }
                if (ijVar.S0) {
                    return org.telegram.messenger.id.M0(2131745262, null);
                }
                return org.telegram.messenger.id.M0(2131745263, null);
            }
            SpannableStringBuilder[] spannableStringBuilderArr = f52357s0;
            if (spannableStringBuilderArr[i7] == null) {
                spannableStringBuilderArr[i7] = new SpannableStringBuilder(">");
                if (i7 == 0) {
                    i10 = 2131230875;
                } else if (i7 == 1) {
                    i10 = 2131232229;
                } else if (i7 == 2) {
                    i10 = 2131232228;
                } else {
                    return "";
                }
                Drawable mutate = org.telegram.messenger.t0.f25566b.getDrawable(i10).mutate();
                if (i7 == 0) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(i11, mutate);
                if (i7 == 1 || i7 == 2) {
                    wpVar.H = 0.85f;
                }
                SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i7];
                spannableStringBuilder.setSpan(wpVar, 0, spannableStringBuilder.length(), 0);
            }
            TLRPC.Message message2 = ijVar.f23262k;
            if (message2.saved_peer_id != null) {
                if (ijVar.Q1() >= 0) {
                    user2 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).a2(Long.valueOf(ijVar.Q1()));
                    chat = null;
                } else if (ijVar.Q1() < 0) {
                    chat = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).M0(Long.valueOf(-ijVar.Q1()));
                    user2 = null;
                    chat2 = null;
                } else {
                    user2 = null;
                    chat = null;
                }
                chat2 = chat;
            } else {
                if (message2.from_id.user_id != 0) {
                    user = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).a2(Long.valueOf(ijVar.f23262k.from_id.user_id));
                } else {
                    user = null;
                }
                if (ijVar.f23262k.from_id.chat_id != 0) {
                    chat = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).M0(Long.valueOf(ijVar.f23262k.peer_id.chat_id));
                } else {
                    chat = null;
                }
                if (chat == null) {
                    if (ijVar.f23262k.from_id.channel_id != 0) {
                        chat = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).M0(Long.valueOf(ijVar.f23262k.peer_id.channel_id));
                    } else {
                        chat = null;
                    }
                }
                if (ijVar.f23262k.peer_id.channel_id != 0) {
                    chat2 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).M0(Long.valueOf(ijVar.f23262k.peer_id.channel_id));
                } else {
                    chat2 = null;
                }
                if (chat2 == null) {
                    if (ijVar.f23262k.peer_id.chat_id != 0) {
                        chat2 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).M0(Long.valueOf(ijVar.f23262k.peer_id.chat_id));
                    } else {
                        chat2 = null;
                    }
                }
                if (!org.telegram.messenger.t3.V(chat2) && !z9) {
                    chat2 = null;
                }
                user2 = user;
            }
            if (user2 != null && chat2 != null) {
                CharSequence charSequence2 = chat2.title;
                if (org.telegram.messenger.t3.c0(chat2) && (f11 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).f24877q7.f(chat2.f26956id, org.telegram.messenger.ij.c2(ijVar.I1, ijVar.f23262k, true, false))) != null) {
                    charSequence2 = qg.d.j(f11, null, null);
                }
                if (textPaint == null) {
                    fontMetricsInt3 = null;
                } else {
                    fontMetricsInt3 = textPaint.getFontMetricsInt();
                }
                CharSequence m10 = org.telegram.messenger.i6.m(charSequence2, fontMetricsInt3, false, null, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                String j3 = org.telegram.messenger.t10.j(user2, true);
                if (textPaint == null) {
                    fontMetricsInt4 = null;
                } else {
                    fontMetricsInt4 = textPaint.getFontMetricsInt();
                }
                spannableStringBuilder2.append(org.telegram.messenger.i6.m(j3, fontMetricsInt4, false, null, 0)).append((char) 8202).append((CharSequence) spannableStringBuilderArr[i7]).append((char) 8202).append(m10);
                charSequence = spannableStringBuilder2;
            } else if (user2 != null) {
                String p10 = org.telegram.messenger.t10.p(user2);
                if (textPaint == null) {
                    fontMetricsInt2 = null;
                } else {
                    fontMetricsInt2 = textPaint.getFontMetricsInt();
                }
                charSequence = org.telegram.messenger.i6.m(p10, fontMetricsInt2, false, null, 0);
            } else if (chat != null) {
                CharSequence charSequence3 = chat.title;
                if (org.telegram.messenger.t3.c0(chat) && (f10 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).f24877q7.f(chat.f26956id, org.telegram.messenger.ij.c2(ijVar.I1, ijVar.f23262k, true, false))) != null) {
                    charSequence3 = qg.d.j(f10, null, null);
                }
                if (textPaint == null) {
                    fontMetricsInt = null;
                } else {
                    fontMetricsInt = textPaint.getFontMetricsInt();
                }
                charSequence = org.telegram.messenger.i6.m(charSequence3, fontMetricsInt, false, null, 0);
            }
            if (charSequence != null) {
                return charSequence;
            }
            return "";
        }
        return "";
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            b();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27872e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27891f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27982k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27837c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27855d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.C9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28247y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28228x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28209w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28190v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28171u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28151t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28095q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28075p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27964j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28020m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27910g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27946i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27818b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27798a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28236xi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28262z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.pj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28217wi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
    }

    public final void b() {
        int i7;
        float f10 = this.f52358a.f55487e;
        float f11 = (1.0f - f10) * (-org.telegram.messenger.g0.L(24.0f));
        qz qzVar = this.m0;
        qzVar.setTranslationY(f11);
        qzVar.setAlpha(f10);
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        qzVar.setVisibility(i7);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25018i4) {
            zs zsVar = this.f52360b;
            int childCount = zsVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (zsVar.getChildAt(i11) instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) zsVar.getChildAt(i11)).j0(0, true);
                }
                zsVar.getChildAt(i11).invalidate();
            }
        }
    }

    public final void e(java.util.ArrayList r12, long r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yz.e(java.util.ArrayList, long):void");
    }

    public final void f(int i7, View view, org.telegram.messenger.ij ijVar, int i10) {
        TLRPC.WebPage webPage;
        String str;
        if (ijVar != null) {
            if (this.f52377o0.i()) {
                this.f52377o0.h(ijVar, view, i10);
            } else if (view instanceof org.telegram.ui.Cells.t2) {
                this.f52377o0.g(ijVar);
            } else {
                int i11 = this.D.d;
                lz lzVar = this.f52369g0;
                ArrayList arrayList = this.f52367f;
                String str2 = null;
                org.telegram.ui.ActionBar.f2 f2Var = this.L;
                if (i11 == 0) {
                    PhotoViewer.p1().H2(null, f2Var, null);
                    PhotoViewer.p1().Z1(arrayList, i7, 0L, 0L, 0L, lzVar);
                    this.R = PhotoViewer.p1().f41365c;
                } else if (i11 != 3 && i11 != 5) {
                    if (i11 == 1) {
                        if (view instanceof org.telegram.ui.Cells.h7) {
                            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                            TLRPC.Document F0 = ijVar.F0();
                            if (h7Var.G) {
                                if (ijVar.x()) {
                                    PhotoViewer.p1().H2(null, f2Var, null);
                                    int indexOf = arrayList.indexOf(ijVar);
                                    if (indexOf < 0) {
                                        ArrayList k10 = org.telegram.messenger.k5.k(ijVar);
                                        PhotoViewer.p1().H2(null, f2Var, null);
                                        PhotoViewer.p1().Z1(k10, 0, 0L, 0L, 0L, lzVar);
                                        this.R = PhotoViewer.p1().f41365c;
                                        return;
                                    }
                                    PhotoViewer.p1().H2(null, f2Var, null);
                                    PhotoViewer.p1().Z1(arrayList, indexOf, 0L, 0L, 0L, lzVar);
                                    this.R = PhotoViewer.p1().f41365c;
                                    return;
                                }
                                org.telegram.messenger.g0.s2(ijVar, this.K, f2Var);
                            } else if (!h7Var.F) {
                                org.telegram.messenger.ij message = h7Var.getMessage();
                                message.P = true;
                                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.p10.f24470s0).f21765a).W(F0, message, 0, 0);
                                h7Var.f(true);
                            } else {
                                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.p10.f24470s0).f21765a).f(F0);
                                h7Var.f(true);
                            }
                        }
                    } else if (i11 == 2) {
                        try {
                            TLRPC.MessageMedia messageMedia = ijVar.f23262k.media;
                            if (messageMedia != null) {
                                webPage = messageMedia.webpage;
                            } else {
                                webPage = null;
                            }
                            if (webPage != null && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                                if (webPage.cached_page != null) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.G1.O().l(ijVar) == null) {
                                        f2Var.createArticleViewer(false).L(ijVar, null, null, null);
                                        return;
                                    }
                                    return;
                                }
                                String str3 = webPage.embed_url;
                                if (str3 != null && str3.length() != 0) {
                                    org.telegram.ui.Components.wt.N0(this.L, ijVar, this.f52369g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                    return;
                                }
                                str = webPage.url;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                ArrayList arrayList2 = ((org.telegram.ui.Cells.k7) view).E;
                                if (arrayList2.size() > 0) {
                                    str2 = ((CharSequence) arrayList2.get(0)).toString();
                                }
                                str = str2;
                            }
                            if (str != null) {
                                g(str);
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                    }
                } else if (view instanceof org.telegram.ui.Cells.g7) {
                    ((org.telegram.ui.Cells.g7) view).a();
                }
            }
        }
    }

    public final void g(String str) {
        if (org.telegram.messenger.g0.J3(str)) {
            org.telegram.ui.Components.v4.n0(this.L, str, true, true);
        } else {
            vf.c.t(this.K, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27925h5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27796a7));
        int i7 = org.telegram.ui.ActionBar.k6.i7;
        zs zsVar = this.f52360b;
        arrayList.add(new org.telegram.ui.ActionBar.t6(zsVar, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        int i10 = org.telegram.ui.ActionBar.k6.f27982k7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(zsVar, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(zsVar, 8, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(zsVar, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27926h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(zsVar, 8192, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(zsVar, 16384, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(zsVar, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(zsVar, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        org.telegram.ui.Components.av0 av0Var = this.f52362c;
        arrayList.add(new org.telegram.ui.ActionBar.t6(av0Var.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(av0Var.f31927e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28244y6));
        return arrayList;
    }

    public final void h(final long j3, final long j10, final long j11, final long j12, final jg.o0 o0Var, final boolean z9, String str, boolean z10) {
        final String str2;
        int i7;
        boolean z11;
        boolean z12;
        ArrayList arrayList;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        Locale locale = Locale.ENGLISH;
        if (o0Var == null) {
            i7 = -1;
        } else {
            i7 = o0Var.d;
        }
        final String str3 = j3 + j10 + j11 + j12 + i7 + str2 + z9;
        String str4 = this.f52385y;
        if (str4 != null && str4.equals(str3)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.D = o0Var;
        this.E = j3;
        this.F = j10;
        this.H = j11;
        this.G = j12;
        this.I = str2;
        this.J = z9;
        iz izVar = this.f52365e;
        if (izVar != null) {
            org.telegram.messenger.g0.r(izVar);
        }
        m4 m4Var = this.f52368f0;
        org.telegram.messenger.g0.r(m4Var);
        if (!z11 || !z10) {
            ArrayList arrayList2 = this.f52364d0;
            final boolean z13 = z11;
            ArrayList arrayList3 = this.f52363c0;
            org.telegram.ui.Components.av0 av0Var = this.f52362c;
            ArrayList arrayList4 = this.f52367f;
            long j13 = 0;
            if (!z12 && (o0Var != null || j10 != 0 || j3 != 0 || j11 != 0 || j12 != 0)) {
                if (!z10 || arrayList4.isEmpty()) {
                    arrayList = arrayList4;
                } else {
                    return;
                }
            } else {
                arrayList4.clear();
                this.f52375n.clear();
                this.f52380r.clear();
                this.M = true;
                av0Var.setVisibility(0);
                org.telegram.ui.Components.oj0 oj0Var = this.d;
                if (oj0Var != null) {
                    oj0Var.f();
                }
                this.P++;
                zs zsVar = this.f52360b;
                if (zsVar.getPinnedHeader() != null) {
                    arrayList = arrayList4;
                    zsVar.getPinnedHeader().setAlpha(0.0f);
                } else {
                    arrayList = arrayList4;
                }
                arrayList3.clear();
                arrayList2.clear();
                if (!z12) {
                    return;
                }
            }
            this.M = true;
            org.telegram.ui.Components.oj0 oj0Var2 = this.d;
            if (oj0Var2 != null) {
                oj0Var2.f();
            }
            if (!z13) {
                m4Var.run();
                av0Var.e(true, !z10);
            }
            if (TextUtils.isEmpty(str2)) {
                arrayList2.clear();
                arrayList3.clear();
                pz pzVar = this.f52370h0;
                if (pzVar != null) {
                    ((fu) pzVar).j(false, null, null, false);
                }
            }
            final int i10 = this.P + 1;
            this.P = i10;
            final int i11 = org.telegram.messenger.p10.f24470s0;
            ?? r02 = new Runnable() {
                @Override
                public final void run() {
                    int i12;
                    String str5;
                    jg.o0 o0Var2;
                    int i13;
                    long j14;
                    boolean z14;
                    long j15;
                    int i14;
                    TLRPC.MessagesFilter messagesFilter;
                    int i15;
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                    TLRPC.MessagesFilter messagesFilter2;
                    final yz yzVar = yz.this;
                    ArrayList arrayList5 = yzVar.f52367f;
                    final long j16 = j3;
                    int i16 = (j16 > 0L ? 1 : (j16 == 0L ? 0 : -1));
                    long j17 = j10;
                    String str6 = str2;
                    jg.o0 o0Var3 = o0Var;
                    int i17 = i11;
                    long j18 = j11;
                    long j19 = j12;
                    boolean z15 = z13;
                    ArrayList arrayList6 = null;
                    if (i16 != 0 && j17 == 0) {
                        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                        tL_messages_search.f27067q = str6;
                        tL_messages_search.limit = 20;
                        if (o0Var3 == null) {
                            messagesFilter2 = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter2 = o0Var3.f16873e;
                        }
                        tL_messages_search.filter = messagesFilter2;
                        tL_messages_search.peer = org.telegram.messenger.qp.s1(org.telegram.messenger.c.a(i17).f21765a).j1(j16);
                        if (j18 > 0) {
                            tL_messages_search.min_date = (int) (j18 / 1000);
                        }
                        if (j19 > 0) {
                            tL_messages_search.max_date = (int) (j19 / 1000);
                        }
                        if (z15 && str6.equals(yzVar.f52384x) && !arrayList5.isEmpty()) {
                            tL_messages_search.offset_id = ((org.telegram.messenger.ij) jg.g.i(1, arrayList5)).f1();
                        } else {
                            tL_messages_search.offset_id = 0;
                        }
                        i12 = i17;
                        str5 = str6;
                        o0Var2 = o0Var3;
                        j14 = j18;
                        tL_messages_searchGlobal = tL_messages_search;
                        z14 = z15;
                    } else {
                        boolean isEmpty = TextUtils.isEmpty(str6);
                        boolean z16 = z9;
                        if (!isEmpty) {
                            j14 = j18;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = new ArrayList();
                            z14 = z15;
                            ArrayList arrayList9 = new ArrayList();
                            org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(i17);
                            j15 = j19;
                            i12 = i17;
                            str5 = str6;
                            o0Var2 = o0Var3;
                            i14 = 20;
                            a02.M0(0, str5, arrayList7, arrayList8, arrayList9, null, z16 ? 1 : 0);
                            i13 = z16 ? 1 : 0;
                            arrayList6 = arrayList7;
                        } else {
                            i12 = i17;
                            str5 = str6;
                            o0Var2 = o0Var3;
                            i13 = z16 ? 1 : 0;
                            j14 = j18;
                            z14 = z15;
                            j15 = j19;
                            i14 = 20;
                        }
                        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                        tL_messages_searchGlobal2.limit = i14;
                        tL_messages_searchGlobal2.f27069q = str5;
                        if (o0Var2 == null) {
                            messagesFilter = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter = o0Var2.f16873e;
                        }
                        tL_messages_searchGlobal2.filter = messagesFilter;
                        tL_messages_searchGlobal2.community = org.telegram.messenger.qp.s1(i12).h1(j17);
                        if (j14 > 0) {
                            tL_messages_searchGlobal2.min_date = (int) (j14 / 1000);
                        }
                        if (j15 > 0) {
                            tL_messages_searchGlobal2.max_date = (int) (j15 / 1000);
                        }
                        if (z14 && str5.equals(yzVar.f52384x) && !arrayList5.isEmpty()) {
                            i15 = 1;
                            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg.g.i(1, arrayList5);
                            tL_messages_searchGlobal2.offset_id = ijVar.f1();
                            tL_messages_searchGlobal2.offset_rate = yzVar.f52383w;
                            tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.qp.s1(i12).j1(org.telegram.messenger.ij.C1(ijVar.f23262k.peer_id));
                        } else {
                            i15 = 1;
                            tL_messages_searchGlobal2.offset_rate = 0;
                            tL_messages_searchGlobal2.offset_id = 0;
                            tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        }
                        tL_messages_searchGlobal2.flags |= i15;
                        tL_messages_searchGlobal2.folder_id = i13;
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    }
                    yzVar.f52384x = str5;
                    yzVar.f52385y = str3;
                    final ArrayList arrayList10 = new ArrayList();
                    jg.q0.B1(yzVar.f52384x, arrayList10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                    final boolean z17 = z14;
                    final int i18 = i10;
                    final jg.o0 o0Var4 = o0Var2;
                    final String str7 = str5;
                    final int i19 = i12;
                    final ArrayList arrayList11 = arrayList6;
                    final long j20 = j14;
                    connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new org.telegram.messenger.v10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                            final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            final ArrayList arrayList12 = new ArrayList();
                            final int i20 = i19;
                            final String str8 = str7;
                            if (tL_error == null) {
                                int size = messages_messages.messages.size();
                                for (int i21 = 0; i21 < size; i21++) {
                                    org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(i20, messages_messages.messages.get(i21), false, true);
                                    ijVar2.L5(str8, true);
                                    arrayList12.add(ijVar2);
                                }
                            }
                            final yz yzVar2 = yz.this;
                            final int i22 = i18;
                            final boolean z18 = z17;
                            final jg.o0 o0Var5 = o0Var4;
                            final long j21 = j16;
                            final long j22 = j20;
                            final ArrayList arrayList13 = arrayList11;
                            final ArrayList arrayList14 = arrayList10;
                            org.telegram.messenger.g0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kz.run():void");
                                }
                            });
                        }
                    });
                }
            };
            this.f52365e = r02;
            org.telegram.messenger.g0.i3(r02, (!z13 || arrayList.isEmpty()) ? 350L : 350L);
            mz mzVar = this.f52373k0;
            if (o0Var == null) {
                mzVar.setViewType(1);
                return;
            }
            int i12 = o0Var.d;
            if (i12 == 0) {
                if (!TextUtils.isEmpty(this.I)) {
                    mzVar.setViewType(1);
                } else {
                    mzVar.setViewType(2);
                }
            } else if (i12 == 1) {
                mzVar.setViewType(3);
            } else if (i12 != 3 && i12 != 5) {
                if (i12 == 2) {
                    mzVar.setViewType(5);
                }
            } else {
                mzVar.setViewType(4);
            }
        }
    }

    public final void i(pz pzVar, boolean z9) {
        this.f52370h0 = pzVar;
        if (z9 && pzVar != null) {
            ArrayList arrayList = this.f52363c0;
            if (!arrayList.isEmpty()) {
                ((fu) pzVar).j(false, arrayList, this.f52364d0, this.f52366e0);
            }
        }
    }

    public final void j(int i7, int i10, boolean z9) {
        setClipToPadding(false);
        this.f52381r0 = z9;
        setPadding(0, i7, 0, i10);
        zs zsVar = this.f52360b;
        if (z9) {
            zsVar.q1(0, i7, 0, i10);
        } else {
            zsVar.setPadding(0, i7, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zsVar.getLayoutParams();
        marginLayoutParams.topMargin = -i7;
        marginLayoutParams.bottomMargin = -i10;
        this.f52381r0 = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = org.telegram.messenger.p10.f24470s0;
        this.f52379q0 = i7;
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.f25018i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.f52379q0).n(this, org.telegram.messenger.qs.f25018i4);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.Components.oj0 oj0Var;
        int i11 = this.f52382s;
        if (org.telegram.messenger.g0.Q1()) {
            this.f52382s = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.f52382s = 6;
        } else {
            this.f52382s = 3;
        }
        if (i11 != this.f52382s && (oj0Var = this.d) == this.U) {
            this.f52381r0 = true;
            oj0Var.f();
            this.f52381r0 = false;
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f52381r0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(dh.c cVar) {
        gh.e eVar = new gh.e(null);
        eVar.f13971e = new g2.c(12);
        eVar.f(385875968, 402653183);
        eVar.e(385875968, 402653183);
        eVar.d(0, 0);
        eVar.f13972f = 1.0f;
        eVar.h = 1.0f;
        qz qzVar = this.m0;
        fh.g c10 = cVar.c(qzVar, eVar, false);
        qzVar.f49337b = c10;
        c10.r(org.telegram.messenger.g0.L(11.5f));
        qzVar.f49337b.q(org.telegram.messenger.g0.L(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.bm0 bm0Var) {
        this.f52371i0 = bm0Var;
    }

    public void setUiCallback(xz xzVar) {
        this.f52377o0 = xzVar;
    }

    public void setUseFromUserAsAvatar(boolean z9) {
        this.f52378p0 = z9;
    }

    @Override
    public final void updateColors() {
        try {
            qz qzVar = this.m0;
            if (qzVar != null) {
                qzVar.updateColors();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void F(float f10, int i7) {
    }
}

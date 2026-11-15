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
public final class zz extends FrameLayout implements org.telegram.ui.ActionBar.z5, org.telegram.messenger.is, te.b {
    public static final SpannableStringBuilder[] f54072t0 = new SpannableStringBuilder[3];
    public jg.o0 E;
    public long F;
    public long G;
    public long H;
    public long I;
    public String J;
    public boolean K;
    public final Activity L;
    public final org.telegram.ui.ActionBar.e2 M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public String R;
    public int S;
    public final sz T;
    public final tz U;
    public final xz V;
    public final uz W;
    public final te.a f54073a;
    public final wz f54074a0;
    public final ct f54075b;
    public final uz f54076b0;
    public final org.telegram.ui.Components.cv0 f54077c;
    public final uz f54078c0;
    public org.telegram.ui.Components.tj0 d;
    public final ArrayList f54079d0;
    public jz f54080e;
    public final ArrayList f54081e0;
    public final ArrayList f54082f;
    public boolean f54083f0;
    public final m4 f54084g0;
    public final SparseArray h;
    public final mz f54085h0;
    public qz f54086i0;
    public org.telegram.ui.Components.fm0 f54087j0;
    public final v4.b0 f54088k0;
    public final nz f54089l0;
    public final h2.f m0;
    public final ArrayList f54090n;
    public final rz f54091n0;
    public final iz f54092o0;
    public yz f54093p0;
    public boolean f54094q0;
    public final HashMap f54095r;
    public int f54096r0;
    public int f54097s;
    public boolean f54098s0;
    public int f54099w;
    public String f54100x;
    public String f54101y;

    public zz(org.telegram.ui.ActionBar.e2 e2Var) {
        super(e2Var.getParentActivity());
        this.f54073a = new te.a(0, this, org.telegram.ui.Components.er.h, 380L, false);
        this.f54082f = new ArrayList();
        this.h = new SparseArray();
        this.f54090n = new ArrayList();
        this.f54095r = new HashMap();
        this.f54097s = 3;
        this.T = new sz(0, 0L);
        this.f54079d0 = new ArrayList();
        this.f54081e0 = new ArrayList();
        this.f54084g0 = new m4(this, 5);
        this.f54085h0 = new mz(this);
        this.m0 = new h2.f((int[]) null);
        this.f54092o0 = new iz(this, 0);
        this.M = e2Var;
        Activity parentActivity = e2Var.getParentActivity();
        this.L = parentActivity;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, this, null);
        ct ctVar = new ct(2, parentActivity, this);
        this.f54075b = ctVar;
        ctVar.setOnItemClickListener(new h(this, 12));
        ctVar.setOnItemLongClickListener(new f(this, 15));
        v4.b0 b0Var = new v4.b0();
        this.f54088k0 = b0Var;
        ctVar.setLayoutManager(b0Var);
        nz nzVar = new nz(0, parentActivity, this);
        this.f54089l0 = nzVar;
        addView(nzVar);
        addView(ctVar);
        ctVar.setSectionsType(2);
        ctVar.setSkipDrawSection(true);
        ctVar.setOnScrollListener(new oz(this));
        rz rzVar = new rz(parentActivity);
        this.f54091n0 = rzVar;
        String u10 = org.telegram.messenger.hd.u((int) (System.currentTimeMillis() / 1000), false);
        if (!TextUtils.equals(rzVar.f51057c, u10)) {
            rzVar.f51057c = u10;
            rzVar.f51055a.t(u10, true, true);
        }
        addView(rzVar, c8.ja.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.U = new tz(this);
        this.V = new xz(this, getContext());
        this.W = new uz(this, getContext(), 1);
        this.f54074a0 = new wz(this, getContext());
        this.f54076b0 = new uz(this, getContext(), 4);
        this.f54078c0 = new uz(this, getContext(), 2);
        org.telegram.ui.Components.cv0 cv0Var = new org.telegram.ui.Components.cv0(parentActivity, nzVar, 1, null);
        this.f54077c = cv0Var;
        addView(cv0Var);
        ctVar.setEmptyView(cv0Var);
        cv0Var.setVisibility(8);
        b();
    }

    public static void a(zz zzVar, org.telegram.messenger.gj gjVar, View view, int i7) {
        if (!zzVar.f54093p0.g0()) {
            zzVar.f54093p0.j();
        }
        if (zzVar.f54093p0.g0()) {
            zzVar.f54093p0.M(gjVar, view, i7);
        }
    }

    public static CharSequence c(org.telegram.messenger.gj gjVar, boolean z10) {
        return d(gjVar, z10, 0, null);
    }

    public static CharSequence d(org.telegram.messenger.gj gjVar, boolean z10, int i7, TextPaint textPaint) {
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
        if (gjVar != null && (message = gjVar.f23817k) != null) {
            if (org.telegram.messenger.gj.b4(message)) {
                kg.u1 c10 = kg.v1.f(gjVar.K1).c(org.telegram.messenger.gj.I1(gjVar.f23817k));
                if (c10 != null) {
                    return c10.f18114b;
                }
                return "";
            }
            CharSequence charSequence = null;
            if (gjVar.r4()) {
                if (gjVar.f23778b1) {
                    return org.telegram.messenger.hd.M0(2131745258, null);
                }
                if (gjVar.U0) {
                    return org.telegram.messenger.hd.M0(2131745259, null);
                }
                return org.telegram.messenger.hd.M0(2131745260, null);
            }
            SpannableStringBuilder[] spannableStringBuilderArr = f54072t0;
            if (spannableStringBuilderArr[i7] == null) {
                spannableStringBuilderArr[i7] = new SpannableStringBuilder(">");
                if (i7 == 0) {
                    i10 = 2131230875;
                } else if (i7 == 1) {
                    i10 = 2131232230;
                } else if (i7 == 2) {
                    i10 = 2131232229;
                } else {
                    return "";
                }
                Drawable mutate = org.telegram.messenger.t0.f26600b.getDrawable(i10).mutate();
                if (i7 == 0) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(i11, mutate);
                if (i7 == 1 || i7 == 2) {
                    eqVar.I = 0.85f;
                }
                SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i7];
                spannableStringBuilder.setSpan(eqVar, 0, spannableStringBuilder.length(), 0);
            }
            TLRPC.Message message2 = gjVar.f23817k;
            if (message2.saved_peer_id != null) {
                if (gjVar.P1() >= 0) {
                    user2 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).a2(Long.valueOf(gjVar.P1()));
                    chat = null;
                } else if (gjVar.P1() < 0) {
                    chat = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).M0(Long.valueOf(-gjVar.P1()));
                    user2 = null;
                    chat2 = null;
                } else {
                    user2 = null;
                    chat = null;
                }
                chat2 = chat;
            } else {
                if (message2.from_id.user_id != 0) {
                    user = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).a2(Long.valueOf(gjVar.f23817k.from_id.user_id));
                } else {
                    user = null;
                }
                if (gjVar.f23817k.from_id.chat_id != 0) {
                    chat = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).M0(Long.valueOf(gjVar.f23817k.peer_id.chat_id));
                } else {
                    chat = null;
                }
                if (chat == null) {
                    if (gjVar.f23817k.from_id.channel_id != 0) {
                        chat = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).M0(Long.valueOf(gjVar.f23817k.peer_id.channel_id));
                    } else {
                        chat = null;
                    }
                }
                if (gjVar.f23817k.peer_id.channel_id != 0) {
                    chat2 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).M0(Long.valueOf(gjVar.f23817k.peer_id.channel_id));
                } else {
                    chat2 = null;
                }
                if (chat2 == null) {
                    if (gjVar.f23817k.peer_id.chat_id != 0) {
                        chat2 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).M0(Long.valueOf(gjVar.f23817k.peer_id.chat_id));
                    } else {
                        chat2 = null;
                    }
                }
                if (!org.telegram.messenger.t3.V(chat2) && !z10) {
                    chat2 = null;
                }
                user2 = user;
            }
            if (user2 != null && chat2 != null) {
                CharSequence charSequence2 = chat2.title;
                if (org.telegram.messenger.t3.c0(chat2) && (f11 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).f25383r7.f(chat2.f28051id, org.telegram.messenger.gj.b2(gjVar.K1, gjVar.f23817k, true, false))) != null) {
                    charSequence2 = qg.c.j(f11, null, null);
                }
                if (textPaint == null) {
                    fontMetricsInt3 = null;
                } else {
                    fontMetricsInt3 = textPaint.getFontMetricsInt();
                }
                CharSequence m10 = org.telegram.messenger.j6.m(charSequence2, fontMetricsInt3, false, null, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                String j3 = org.telegram.messenger.q10.j(user2, true);
                if (textPaint == null) {
                    fontMetricsInt4 = null;
                } else {
                    fontMetricsInt4 = textPaint.getFontMetricsInt();
                }
                spannableStringBuilder2.append(org.telegram.messenger.j6.m(j3, fontMetricsInt4, false, null, 0)).append((char) 8202).append((CharSequence) spannableStringBuilderArr[i7]).append((char) 8202).append(m10);
                charSequence = spannableStringBuilder2;
            } else if (user2 != null) {
                String p10 = org.telegram.messenger.q10.p(user2);
                if (textPaint == null) {
                    fontMetricsInt2 = null;
                } else {
                    fontMetricsInt2 = textPaint.getFontMetricsInt();
                }
                charSequence = org.telegram.messenger.j6.m(p10, fontMetricsInt2, false, null, 0);
            } else if (chat != null) {
                CharSequence charSequence3 = chat.title;
                if (org.telegram.messenger.t3.c0(chat) && (f10 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).f25383r7.f(chat.f28051id, org.telegram.messenger.gj.b2(gjVar.K1, gjVar.f23817k, true, false))) != null) {
                    charSequence3 = qg.c.j(f10, null, null);
                }
                if (textPaint == null) {
                    fontMetricsInt = null;
                } else {
                    fontMetricsInt = textPaint.getFontMetricsInt();
                }
                charSequence = org.telegram.messenger.j6.m(charSequence3, fontMetricsInt, false, null, 0);
            }
            if (charSequence != null) {
                return charSequence;
            }
            return "";
        }
        return "";
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            b();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28869e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28888f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28979k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28834c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28852d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.C9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29263z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29244y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29225x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29206w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29187v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29168u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29148t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29092q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29072p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28961j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29017m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28907g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28943i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28815b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28794a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29260z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.sj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29272zi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A6));
    }

    public final void b() {
        int i7;
        float f10 = this.f54073a.f57081e;
        float f11 = (1.0f - f10) * (-org.telegram.messenger.g0.L(24.0f));
        rz rzVar = this.f54091n0;
        rzVar.setTranslationY(f11);
        rzVar.setAlpha(f10);
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        rzVar.setVisibility(i7);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25514i4) {
            ct ctVar = this.f54075b;
            int childCount = ctVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (ctVar.getChildAt(i11) instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) ctVar.getChildAt(i11)).k0(0, true);
                }
                ctVar.getChildAt(i11).invalidate();
            }
        }
    }

    public final void e(java.util.ArrayList r12, long r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zz.e(java.util.ArrayList, long):void");
    }

    public final void f(int i7, View view, org.telegram.messenger.gj gjVar, int i10) {
        TLRPC.WebPage webPage;
        String str;
        if (gjVar != null) {
            if (this.f54093p0.g0()) {
                this.f54093p0.M(gjVar, view, i10);
            } else if (view instanceof org.telegram.ui.Cells.t2) {
                this.f54093p0.y(gjVar);
            } else {
                int i11 = this.E.d;
                mz mzVar = this.f54085h0;
                ArrayList arrayList = this.f54082f;
                String str2 = null;
                org.telegram.ui.ActionBar.e2 e2Var = this.M;
                if (i11 == 0) {
                    PhotoViewer.p1().I2(null, e2Var, null);
                    PhotoViewer.p1().a2(arrayList, i7, 0L, 0L, 0L, mzVar);
                    this.S = PhotoViewer.p1().f42734c;
                } else if (i11 != 3 && i11 != 5) {
                    if (i11 == 1) {
                        if (view instanceof org.telegram.ui.Cells.g7) {
                            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                            TLRPC.Document F0 = gjVar.F0();
                            if (g7Var.H) {
                                if (gjVar.x()) {
                                    PhotoViewer.p1().I2(null, e2Var, null);
                                    int indexOf = arrayList.indexOf(gjVar);
                                    if (indexOf < 0) {
                                        ArrayList j3 = org.telegram.messenger.k5.j(gjVar);
                                        PhotoViewer.p1().I2(null, e2Var, null);
                                        PhotoViewer.p1().a2(j3, 0, 0L, 0L, 0L, mzVar);
                                        this.S = PhotoViewer.p1().f42734c;
                                        return;
                                    }
                                    PhotoViewer.p1().I2(null, e2Var, null);
                                    PhotoViewer.p1().a2(arrayList, indexOf, 0L, 0L, 0L, mzVar);
                                    this.S = PhotoViewer.p1().f42734c;
                                    return;
                                }
                                org.telegram.messenger.g0.s2(gjVar, this.L, e2Var);
                            } else if (!g7Var.G) {
                                org.telegram.messenger.gj message = g7Var.getMessage();
                                message.P = true;
                                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.m10.f24934t0).f22778a).W(F0, message, 0, 0);
                                g7Var.f(true);
                            } else {
                                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.m10.f24934t0).f22778a).f(F0);
                                g7Var.f(true);
                            }
                        }
                    } else if (i11 == 2) {
                        try {
                            TLRPC.MessageMedia messageMedia = gjVar.f23817k.media;
                            if (messageMedia != null) {
                                webPage = messageMedia.webpage;
                            } else {
                                webPage = null;
                            }
                            if (webPage != null && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                                if (webPage.cached_page != null) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().l(gjVar) == null) {
                                        e2Var.createArticleViewer(false).L(gjVar, null, null, null);
                                        return;
                                    }
                                    return;
                                }
                                String str3 = webPage.embed_url;
                                if (str3 != null && str3.length() != 0) {
                                    org.telegram.ui.Components.bu.N0(this.M, gjVar, this.f54085h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                    return;
                                }
                                str = webPage.url;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                ArrayList arrayList2 = ((org.telegram.ui.Cells.j7) view).F;
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
                } else if (view instanceof org.telegram.ui.Cells.f7) {
                    ((org.telegram.ui.Cells.f7) view).a();
                }
            }
        }
    }

    public final void g(String str) {
        if (org.telegram.messenger.g0.I3(str)) {
            org.telegram.ui.Components.t4.n0(this.M, str, true, true);
        } else {
            vf.c.t(this.L, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.s6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.s6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28922h5));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28792a7));
        int i7 = org.telegram.ui.ActionBar.j6.i7;
        ct ctVar = this.f54075b;
        arrayList.add(new org.telegram.ui.ActionBar.s6(ctVar, 8192, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        int i10 = org.telegram.ui.ActionBar.j6.f28979k7;
        arrayList.add(new org.telegram.ui.ActionBar.s6(ctVar, 16384, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(ctVar, 8, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.qj));
        arrayList.add(new org.telegram.ui.ActionBar.s6(ctVar, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28923h6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(ctVar, 8192, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(ctVar, 16384, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(ctVar, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(ctVar, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        org.telegram.ui.Components.cv0 cv0Var = this.f54077c;
        arrayList.add(new org.telegram.ui.ActionBar.s6(cv0Var.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(cv0Var.f33707e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29241y6));
        return arrayList;
    }

    public final void h(final long j3, final long j10, final long j11, final long j12, final jg.o0 o0Var, final boolean z10, String str, boolean z11) {
        final String str2;
        int i7;
        boolean z12;
        boolean z13;
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
        final String str3 = j3 + j10 + j11 + j12 + i7 + str2 + z10;
        String str4 = this.f54101y;
        if (str4 != null && str4.equals(str3)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 && z11) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.E = o0Var;
        this.F = j3;
        this.G = j10;
        this.I = j11;
        this.H = j12;
        this.J = str2;
        this.K = z10;
        jz jzVar = this.f54080e;
        if (jzVar != null) {
            org.telegram.messenger.g0.r(jzVar);
        }
        m4 m4Var = this.f54084g0;
        org.telegram.messenger.g0.r(m4Var);
        if (!z12 || !z11) {
            ArrayList arrayList2 = this.f54081e0;
            final boolean z14 = z12;
            ArrayList arrayList3 = this.f54079d0;
            org.telegram.ui.Components.cv0 cv0Var = this.f54077c;
            ArrayList arrayList4 = this.f54082f;
            long j13 = 0;
            if (!z13 && (o0Var != null || j10 != 0 || j3 != 0 || j11 != 0 || j12 != 0)) {
                if (!z11 || arrayList4.isEmpty()) {
                    arrayList = arrayList4;
                } else {
                    return;
                }
            } else {
                arrayList4.clear();
                this.f54090n.clear();
                this.f54095r.clear();
                this.N = true;
                cv0Var.setVisibility(0);
                org.telegram.ui.Components.tj0 tj0Var = this.d;
                if (tj0Var != null) {
                    tj0Var.f();
                }
                this.Q++;
                ct ctVar = this.f54075b;
                if (ctVar.getPinnedHeader() != null) {
                    arrayList = arrayList4;
                    ctVar.getPinnedHeader().setAlpha(0.0f);
                } else {
                    arrayList = arrayList4;
                }
                arrayList3.clear();
                arrayList2.clear();
                if (!z13) {
                    return;
                }
            }
            this.N = true;
            org.telegram.ui.Components.tj0 tj0Var2 = this.d;
            if (tj0Var2 != null) {
                tj0Var2.f();
            }
            if (!z14) {
                m4Var.run();
                cv0Var.e(true, !z11);
            }
            if (TextUtils.isEmpty(str2)) {
                arrayList2.clear();
                arrayList3.clear();
                qz qzVar = this.f54086i0;
                if (qzVar != null) {
                    ((hu) qzVar).j(false, null, null, false);
                }
            }
            final int i10 = this.Q + 1;
            this.Q = i10;
            final int i11 = org.telegram.messenger.m10.f24934t0;
            ?? r02 = new Runnable() {
                @Override
                public final void run() {
                    int i12;
                    String str5;
                    jg.o0 o0Var2;
                    int i13;
                    long j14;
                    boolean z15;
                    long j15;
                    int i14;
                    TLRPC.MessagesFilter messagesFilter;
                    int i15;
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                    TLRPC.MessagesFilter messagesFilter2;
                    final zz zzVar = zz.this;
                    ArrayList arrayList5 = zzVar.f54082f;
                    final long j16 = j3;
                    int i16 = (j16 > 0L ? 1 : (j16 == 0L ? 0 : -1));
                    long j17 = j10;
                    String str6 = str2;
                    jg.o0 o0Var3 = o0Var;
                    int i17 = i11;
                    long j18 = j11;
                    long j19 = j12;
                    boolean z16 = z14;
                    ArrayList arrayList6 = null;
                    if (i16 != 0 && j17 == 0) {
                        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                        tL_messages_search.f28162q = str6;
                        tL_messages_search.limit = 20;
                        if (o0Var3 == null) {
                            messagesFilter2 = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter2 = o0Var3.f17222e;
                        }
                        tL_messages_search.filter = messagesFilter2;
                        tL_messages_search.peer = org.telegram.messenger.np.s1(org.telegram.messenger.c.a(i17).f22778a).j1(j16);
                        if (j18 > 0) {
                            tL_messages_search.min_date = (int) (j18 / 1000);
                        }
                        if (j19 > 0) {
                            tL_messages_search.max_date = (int) (j19 / 1000);
                        }
                        if (z16 && str6.equals(zzVar.f54100x) && !arrayList5.isEmpty()) {
                            tL_messages_search.offset_id = ((org.telegram.messenger.gj) i5.c.h(1, arrayList5)).e1();
                        } else {
                            tL_messages_search.offset_id = 0;
                        }
                        i12 = i17;
                        str5 = str6;
                        o0Var2 = o0Var3;
                        j14 = j18;
                        tL_messages_searchGlobal = tL_messages_search;
                        z15 = z16;
                    } else {
                        boolean isEmpty = TextUtils.isEmpty(str6);
                        boolean z17 = z10;
                        if (!isEmpty) {
                            j14 = j18;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = new ArrayList();
                            z15 = z16;
                            ArrayList arrayList9 = new ArrayList();
                            org.telegram.messenger.vr a02 = org.telegram.messenger.vr.a0(i17);
                            j15 = j19;
                            i12 = i17;
                            str5 = str6;
                            o0Var2 = o0Var3;
                            i14 = 20;
                            a02.M0(0, str5, arrayList7, arrayList8, arrayList9, null, z17 ? 1 : 0);
                            i13 = z17 ? 1 : 0;
                            arrayList6 = arrayList7;
                        } else {
                            i12 = i17;
                            str5 = str6;
                            o0Var2 = o0Var3;
                            i13 = z17 ? 1 : 0;
                            j14 = j18;
                            z15 = z16;
                            j15 = j19;
                            i14 = 20;
                        }
                        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                        tL_messages_searchGlobal2.limit = i14;
                        tL_messages_searchGlobal2.f28164q = str5;
                        if (o0Var2 == null) {
                            messagesFilter = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter = o0Var2.f17222e;
                        }
                        tL_messages_searchGlobal2.filter = messagesFilter;
                        tL_messages_searchGlobal2.community = org.telegram.messenger.np.s1(i12).h1(j17);
                        if (j14 > 0) {
                            tL_messages_searchGlobal2.min_date = (int) (j14 / 1000);
                        }
                        if (j15 > 0) {
                            tL_messages_searchGlobal2.max_date = (int) (j15 / 1000);
                        }
                        if (z15 && str5.equals(zzVar.f54100x) && !arrayList5.isEmpty()) {
                            i15 = 1;
                            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) i5.c.h(1, arrayList5);
                            tL_messages_searchGlobal2.offset_id = gjVar.e1();
                            tL_messages_searchGlobal2.offset_rate = zzVar.f54099w;
                            tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.np.s1(i12).j1(org.telegram.messenger.gj.B1(gjVar.f23817k.peer_id));
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
                    zzVar.f54100x = str5;
                    zzVar.f54101y = str3;
                    final ArrayList arrayList10 = new ArrayList();
                    jg.q0.B1(zzVar.f54100x, arrayList10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                    final boolean z18 = z15;
                    final int i18 = i10;
                    final jg.o0 o0Var4 = o0Var2;
                    final String str7 = str5;
                    final int i19 = i12;
                    final ArrayList arrayList11 = arrayList6;
                    final long j20 = j14;
                    connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new org.telegram.messenger.s10() {
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
                                    org.telegram.messenger.gj gjVar2 = new org.telegram.messenger.gj(i20, messages_messages.messages.get(i21), false, true);
                                    gjVar2.K5(str8, true);
                                    arrayList12.add(gjVar2);
                                }
                            }
                            final zz zzVar2 = zz.this;
                            final int i22 = i18;
                            final boolean z19 = z18;
                            final jg.o0 o0Var5 = o0Var4;
                            final long j21 = j16;
                            final long j22 = j20;
                            final ArrayList arrayList13 = arrayList11;
                            final ArrayList arrayList14 = arrayList10;
                            org.telegram.messenger.g0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lz.run():void");
                                }
                            });
                        }
                    });
                }
            };
            this.f54080e = r02;
            org.telegram.messenger.g0.i3(r02, (!z14 || arrayList.isEmpty()) ? 350L : 350L);
            nz nzVar = this.f54089l0;
            if (o0Var == null) {
                nzVar.setViewType(1);
                return;
            }
            int i12 = o0Var.d;
            if (i12 == 0) {
                if (!TextUtils.isEmpty(this.J)) {
                    nzVar.setViewType(1);
                } else {
                    nzVar.setViewType(2);
                }
            } else if (i12 == 1) {
                nzVar.setViewType(3);
            } else if (i12 != 3 && i12 != 5) {
                if (i12 == 2) {
                    nzVar.setViewType(5);
                }
            } else {
                nzVar.setViewType(4);
            }
        }
    }

    public final void i(qz qzVar, boolean z10) {
        this.f54086i0 = qzVar;
        if (z10 && qzVar != null) {
            ArrayList arrayList = this.f54079d0;
            if (!arrayList.isEmpty()) {
                ((hu) qzVar).j(false, arrayList, this.f54081e0, this.f54083f0);
            }
        }
    }

    public final void j(int i7, int i10, boolean z10) {
        setClipToPadding(false);
        this.f54098s0 = z10;
        setPadding(0, i7, 0, i10);
        ct ctVar = this.f54075b;
        if (z10) {
            ctVar.q1(0, i7, 0, i10);
        } else {
            ctVar.setPadding(0, i7, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ctVar.getLayoutParams();
        marginLayoutParams.topMargin = -i7;
        marginLayoutParams.bottomMargin = -i10;
        this.f54098s0 = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = org.telegram.messenger.m10.f24934t0;
        this.f54096r0 = i7;
        org.telegram.messenger.ns.f(i7).c(this, org.telegram.messenger.ns.f25514i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ns.f(this.f54096r0).n(this, org.telegram.messenger.ns.f25514i4);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.Components.tj0 tj0Var;
        int i11 = this.f54097s;
        if (org.telegram.messenger.g0.Q1()) {
            this.f54097s = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.f54097s = 6;
        } else {
            this.f54097s = 3;
        }
        if (i11 != this.f54097s && (tj0Var = this.d) == this.V) {
            this.f54098s0 = true;
            tj0Var.f();
            this.f54098s0 = false;
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f54098s0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(dh.c cVar) {
        gh.e eVar = new gh.e(null);
        eVar.f13313e = new g0.e(14);
        eVar.f(385875968, 402653183);
        eVar.e(385875968, 402653183);
        eVar.d(0, 0);
        eVar.f13314f = 1.0f;
        eVar.h = 1.0f;
        rz rzVar = this.f54091n0;
        fh.g c10 = cVar.c(rzVar, eVar, false);
        rzVar.f51056b = c10;
        c10.r(org.telegram.messenger.g0.L(11.5f));
        rzVar.f51056b.q(org.telegram.messenger.g0.L(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.fm0 fm0Var) {
        this.f54087j0 = fm0Var;
    }

    public void setUiCallback(yz yzVar) {
        this.f54093p0 = yzVar;
    }

    public void setUseFromUserAsAvatar(boolean z10) {
        this.f54094q0 = z10;
    }

    @Override
    public final void updateColors() {
        try {
            rz rzVar = this.f54091n0;
            if (rzVar != null) {
                rzVar.updateColors();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void E(float f10, int i7) {
    }
}

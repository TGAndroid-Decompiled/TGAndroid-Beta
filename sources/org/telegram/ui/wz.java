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
public final class wz extends FrameLayout implements org.telegram.ui.ActionBar.z5, org.telegram.messenger.cs, qe.b {
    public static final SpannableStringBuilder[] f51635t0 = new SpannableStringBuilder[3];
    public kg.l0 E;
    public long F;
    public long G;
    public long H;
    public long I;
    public String J;
    public boolean K;
    public final Activity L;
    public final org.telegram.ui.ActionBar.d2 M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public String R;
    public int S;
    public final pz T;
    public final qz U;
    public final uz V;
    public final rz W;
    public final qe.a f51636a;
    public final tz f51637a0;
    public final xs f51638b;
    public final rz f51639b0;
    public final org.telegram.ui.Components.zu0 f51640c;
    public final rz f51641c0;
    public org.telegram.ui.Components.sj0 d;
    public final ArrayList f51642d0;
    public gz f51643e;
    public final ArrayList f51644e0;
    public final ArrayList f51645f;
    public boolean f51646f0;
    public final o4 f51647g0;
    public final SparseArray h;
    public final jz f51648h0;
    public nz f51649i0;
    public org.telegram.ui.Components.em0 f51650j0;
    public final u4.b0 f51651k0;
    public final kz f51652l0;
    public final g2.g m0;
    public final ArrayList f51653n;
    public final oz f51654n0;
    public final fz f51655o0;
    public vz f51656p0;
    public boolean f51657q0;
    public final HashMap f51658r;
    public int f51659r0;
    public int f51660s;
    public boolean f51661s0;
    public int f51662w;
    public String f51663x;
    public String f51664y;

    public wz(org.telegram.ui.ActionBar.d2 d2Var) {
        super(d2Var.getParentActivity());
        this.f51636a = new qe.a(0, this, org.telegram.ui.Components.xq.h, 380L, false);
        this.f51645f = new ArrayList();
        this.h = new SparseArray();
        this.f51653n = new ArrayList();
        this.f51658r = new HashMap();
        this.f51660s = 3;
        this.T = new pz(0, 0L);
        this.f51642d0 = new ArrayList();
        this.f51644e0 = new ArrayList();
        this.f51647g0 = new o4(this, 5);
        this.f51648h0 = new jz(this);
        this.m0 = new g2.g((int[]) null);
        this.f51655o0 = new fz(this, 0);
        this.M = d2Var;
        Activity parentActivity = d2Var.getParentActivity();
        this.L = parentActivity;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, this, null);
        xs xsVar = new xs(2, parentActivity, this);
        this.f51638b = xsVar;
        xsVar.setOnItemClickListener(new h(this, 12));
        xsVar.setOnItemLongClickListener(new f(this, 15));
        u4.b0 b0Var = new u4.b0();
        this.f51651k0 = b0Var;
        xsVar.setLayoutManager(b0Var);
        kz kzVar = new kz(0, parentActivity, this);
        this.f51652l0 = kzVar;
        addView(kzVar);
        addView(xsVar);
        xsVar.setSectionsType(2);
        xsVar.setSkipDrawSection(true);
        xsVar.setOnScrollListener(new lz(this));
        oz ozVar = new oz(parentActivity);
        this.f51654n0 = ozVar;
        String u10 = org.telegram.messenger.bd.u((int) (System.currentTimeMillis() / 1000), false);
        if (!TextUtils.equals(ozVar.f48385c, u10)) {
            ozVar.f48385c = u10;
            ozVar.f48383a.t(u10, true, true);
        }
        addView(ozVar, b8.mf.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.U = new qz(this);
        this.V = new uz(this, getContext());
        this.W = new rz(this, getContext(), 1);
        this.f51637a0 = new tz(this, getContext());
        this.f51639b0 = new rz(this, getContext(), 4);
        this.f51641c0 = new rz(this, getContext(), 2);
        org.telegram.ui.Components.zu0 zu0Var = new org.telegram.ui.Components.zu0(parentActivity, kzVar, 1, null);
        this.f51640c = zu0Var;
        addView(zu0Var);
        xsVar.setEmptyView(zu0Var);
        zu0Var.setVisibility(8);
        b();
    }

    public static void a(wz wzVar, org.telegram.messenger.zi ziVar, View view, int i3) {
        if (!wzVar.f51656p0.I()) {
            wzVar.f51656p0.h();
        }
        if (wzVar.f51656p0.I()) {
            wzVar.f51656p0.w(ziVar, view, i3);
        }
    }

    public static CharSequence c(org.telegram.messenger.zi ziVar, boolean z10) {
        return d(ziVar, z10, 0, null);
    }

    public static CharSequence d(org.telegram.messenger.zi ziVar, boolean z10, int i3, TextPaint textPaint) {
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
        if (ziVar != null && (message = ziVar.f26868k) != null) {
            if (org.telegram.messenger.zi.c4(message)) {
                lg.t1 c2 = lg.u1.f(ziVar.I1).c(org.telegram.messenger.zi.J1(ziVar.f26868k));
                if (c2 != null) {
                    return c2.f18474b;
                }
                return "";
            }
            CharSequence charSequence = null;
            if (ziVar.s4()) {
                if (ziVar.Z0) {
                    return org.telegram.messenger.bd.M0(2131745268, null);
                }
                if (ziVar.S0) {
                    return org.telegram.messenger.bd.M0(2131745269, null);
                }
                return org.telegram.messenger.bd.M0(2131745270, null);
            }
            SpannableStringBuilder[] spannableStringBuilderArr = f51635t0;
            if (spannableStringBuilderArr[i3] == null) {
                spannableStringBuilderArr[i3] = new SpannableStringBuilder(">");
                if (i3 == 0) {
                    i10 = 2131230875;
                } else if (i3 == 1) {
                    i10 = 2131232229;
                } else if (i3 == 2) {
                    i10 = 2131232228;
                } else {
                    return "";
                }
                Drawable mutate = org.telegram.messenger.t0.f25457b.getDrawable(i10).mutate();
                if (i3 == 0) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(i11, mutate);
                if (i3 == 1 || i3 == 2) {
                    wpVar.I = 0.85f;
                }
                SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i3];
                spannableStringBuilder.setSpan(wpVar, 0, spannableStringBuilder.length(), 0);
            }
            TLRPC.Message message2 = ziVar.f26868k;
            if (message2.saved_peer_id != null) {
                if (ziVar.Q1() >= 0) {
                    user2 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).a2(Long.valueOf(ziVar.Q1()));
                    chat = null;
                } else if (ziVar.Q1() < 0) {
                    chat = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).M0(Long.valueOf(-ziVar.Q1()));
                    user2 = null;
                    chat2 = null;
                } else {
                    user2 = null;
                    chat = null;
                }
                chat2 = chat;
            } else {
                if (message2.from_id.user_id != 0) {
                    user = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).a2(Long.valueOf(ziVar.f26868k.from_id.user_id));
                } else {
                    user = null;
                }
                if (ziVar.f26868k.from_id.chat_id != 0) {
                    chat = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).M0(Long.valueOf(ziVar.f26868k.peer_id.chat_id));
                } else {
                    chat = null;
                }
                if (chat == null) {
                    if (ziVar.f26868k.from_id.channel_id != 0) {
                        chat = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).M0(Long.valueOf(ziVar.f26868k.peer_id.channel_id));
                    } else {
                        chat = null;
                    }
                }
                if (ziVar.f26868k.peer_id.channel_id != 0) {
                    chat2 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).M0(Long.valueOf(ziVar.f26868k.peer_id.channel_id));
                } else {
                    chat2 = null;
                }
                if (chat2 == null) {
                    if (ziVar.f26868k.peer_id.chat_id != 0) {
                        chat2 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).M0(Long.valueOf(ziVar.f26868k.peer_id.chat_id));
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
                if (org.telegram.messenger.t3.c0(chat2) && (f11 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f23102q7.f(chat2.f27001id, org.telegram.messenger.zi.c2(ziVar.I1, ziVar.f26868k, true, false))) != null) {
                    charSequence2 = rg.c.j(f11, null, null);
                }
                if (textPaint == null) {
                    fontMetricsInt3 = null;
                } else {
                    fontMetricsInt3 = textPaint.getFontMetricsInt();
                }
                CharSequence m10 = org.telegram.messenger.i6.m(charSequence2, fontMetricsInt3, false, null, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                String j10 = org.telegram.messenger.l10.j(user2, true);
                if (textPaint == null) {
                    fontMetricsInt4 = null;
                } else {
                    fontMetricsInt4 = textPaint.getFontMetricsInt();
                }
                spannableStringBuilder2.append(org.telegram.messenger.i6.m(j10, fontMetricsInt4, false, null, 0)).append((char) 8202).append((CharSequence) spannableStringBuilderArr[i3]).append((char) 8202).append(m10);
                charSequence = spannableStringBuilder2;
            } else if (user2 != null) {
                String p10 = org.telegram.messenger.l10.p(user2);
                if (textPaint == null) {
                    fontMetricsInt2 = null;
                } else {
                    fontMetricsInt2 = textPaint.getFontMetricsInt();
                }
                charSequence = org.telegram.messenger.i6.m(p10, fontMetricsInt2, false, null, 0);
            } else if (chat != null) {
                CharSequence charSequence3 = chat.title;
                if (org.telegram.messenger.t3.c0(chat) && (f10 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f23102q7.f(chat.f27001id, org.telegram.messenger.zi.c2(ziVar.I1, ziVar.f26868k, true, false))) != null) {
                    charSequence3 = rg.c.j(f10, null, null);
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
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 0) {
            b();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27899e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27918f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28008k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27864c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27881d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.C9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28293z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28257x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28237w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28217v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28199u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28180t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28161s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28124q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28104p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27992j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28046m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27939g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27975i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27845b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27826a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28265xi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.pj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28246wi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
    }

    public final void b() {
        int i3;
        float f10 = this.f51636a.f53840e;
        float f11 = (1.0f - f10) * (-org.telegram.messenger.g0.L(24.0f));
        oz ozVar = this.f51654n0;
        ozVar.setTranslationY(f11);
        ozVar.setAlpha(f10);
        if (f10 > 0.0f) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        ozVar.setVisibility(i3);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23246i4) {
            xs xsVar = this.f51638b;
            int childCount = xsVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (xsVar.getChildAt(i11) instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) xsVar.getChildAt(i11)).i0(0, true);
                }
                xsVar.getChildAt(i11).invalidate();
            }
        }
    }

    public final void e(java.util.ArrayList r12, long r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wz.e(java.util.ArrayList, long):void");
    }

    public final void f(int i3, View view, org.telegram.messenger.zi ziVar, int i10) {
        TLRPC.WebPage webPage;
        String str;
        if (ziVar != null) {
            if (this.f51656p0.I()) {
                this.f51656p0.w(ziVar, view, i10);
            } else if (view instanceof org.telegram.ui.Cells.t2) {
                this.f51656p0.o(ziVar);
            } else {
                int i11 = this.E.d;
                jz jzVar = this.f51648h0;
                ArrayList arrayList = this.f51645f;
                String str2 = null;
                org.telegram.ui.ActionBar.d2 d2Var = this.M;
                if (i11 == 0) {
                    PhotoViewer.v1().N2(null, d2Var, null);
                    PhotoViewer.v1().e2(arrayList, i3, 0L, 0L, 0L, jzVar);
                    this.S = PhotoViewer.v1().f41391c;
                } else if (i11 != 3 && i11 != 5) {
                    if (i11 == 1) {
                        if (view instanceof org.telegram.ui.Cells.g7) {
                            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                            TLRPC.Document F0 = ziVar.F0();
                            if (g7Var.H) {
                                if (ziVar.x()) {
                                    PhotoViewer.v1().N2(null, d2Var, null);
                                    int indexOf = arrayList.indexOf(ziVar);
                                    if (indexOf < 0) {
                                        ArrayList k10 = org.telegram.messenger.k5.k(ziVar);
                                        PhotoViewer.v1().N2(null, d2Var, null);
                                        PhotoViewer.v1().e2(k10, 0, 0L, 0L, 0L, jzVar);
                                        this.S = PhotoViewer.v1().f41391c;
                                        return;
                                    }
                                    PhotoViewer.v1().N2(null, d2Var, null);
                                    PhotoViewer.v1().e2(arrayList, indexOf, 0L, 0L, 0L, jzVar);
                                    this.S = PhotoViewer.v1().f41391c;
                                    return;
                                }
                                org.telegram.messenger.g0.s2(ziVar, this.L, d2Var);
                            } else if (!g7Var.G) {
                                org.telegram.messenger.zi message = g7Var.getMessage();
                                message.P = true;
                                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.h10.f22829t0).f21919a).X(F0, message, 0, 0);
                                g7Var.f(true);
                            } else {
                                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.h10.f22829t0).f21919a).f(F0);
                                g7Var.f(true);
                            }
                        }
                    } else if (i11 == 2) {
                        try {
                            TLRPC.MessageMedia messageMedia = ziVar.f26868k.media;
                            if (messageMedia != null) {
                                webPage = messageMedia.webpage;
                            } else {
                                webPage = null;
                            }
                            if (webPage != null && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                                if (webPage.cached_page != null) {
                                    LaunchActivity launchActivity = LaunchActivity.K1;
                                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.K1.O().l(ziVar) == null) {
                                        d2Var.createArticleViewer(false).L(ziVar, null, null, null);
                                        return;
                                    }
                                    return;
                                }
                                String str3 = webPage.embed_url;
                                if (str3 != null && str3.length() != 0) {
                                    org.telegram.ui.Components.ut.K0(this.M, ziVar, this.f51648h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
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
        if (org.telegram.messenger.g0.J3(str)) {
            org.telegram.ui.Components.t4.p0(this.M, str, true, true);
        } else {
            sf.c.t(this.L, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27954h5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27824a7));
        int i3 = org.telegram.ui.ActionBar.k6.f27973i7;
        xs xsVar = this.f51638b;
        arrayList.add(new org.telegram.ui.ActionBar.t6(xsVar, 8192, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        int i10 = org.telegram.ui.ActionBar.k6.f28008k7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(xsVar, 16384, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(xsVar, 8, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(xsVar, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27955h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(xsVar, 8192, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(xsVar, 16384, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(xsVar, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(xsVar, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        org.telegram.ui.Components.zu0 zu0Var = this.f51640c;
        arrayList.add(new org.telegram.ui.ActionBar.t6(zu0Var.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(zu0Var.f41128e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28273y6));
        return arrayList;
    }

    public final void h(final long j10, final long j11, final long j12, final long j13, final kg.l0 l0Var, final boolean z10, String str, boolean z11) {
        final String str2;
        int i3;
        boolean z12;
        boolean z13;
        ArrayList arrayList;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        Locale locale = Locale.ENGLISH;
        if (l0Var == null) {
            i3 = -1;
        } else {
            i3 = l0Var.d;
        }
        final String str3 = j10 + j11 + j12 + j13 + i3 + str2 + z10;
        String str4 = this.f51664y;
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
        this.E = l0Var;
        this.F = j10;
        this.G = j11;
        this.I = j12;
        this.H = j13;
        this.J = str2;
        this.K = z10;
        gz gzVar = this.f51643e;
        if (gzVar != null) {
            org.telegram.messenger.g0.r(gzVar);
        }
        o4 o4Var = this.f51647g0;
        org.telegram.messenger.g0.r(o4Var);
        if (!z12 || !z11) {
            ArrayList arrayList2 = this.f51644e0;
            final boolean z14 = z12;
            ArrayList arrayList3 = this.f51642d0;
            org.telegram.ui.Components.zu0 zu0Var = this.f51640c;
            ArrayList arrayList4 = this.f51645f;
            long j14 = 0;
            if (!z13 && (l0Var != null || j11 != 0 || j10 != 0 || j12 != 0 || j13 != 0)) {
                if (!z11 || arrayList4.isEmpty()) {
                    arrayList = arrayList4;
                } else {
                    return;
                }
            } else {
                arrayList4.clear();
                this.f51653n.clear();
                this.f51658r.clear();
                this.N = true;
                zu0Var.setVisibility(0);
                org.telegram.ui.Components.sj0 sj0Var = this.d;
                if (sj0Var != null) {
                    sj0Var.f();
                }
                this.Q++;
                xs xsVar = this.f51638b;
                if (xsVar.getPinnedHeader() != null) {
                    arrayList = arrayList4;
                    xsVar.getPinnedHeader().setAlpha(0.0f);
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
            org.telegram.ui.Components.sj0 sj0Var2 = this.d;
            if (sj0Var2 != null) {
                sj0Var2.f();
            }
            if (!z14) {
                o4Var.run();
                zu0Var.e(true, !z11);
            }
            if (TextUtils.isEmpty(str2)) {
                arrayList2.clear();
                arrayList3.clear();
                nz nzVar = this.f51649i0;
                if (nzVar != null) {
                    ((du) nzVar).j(false, null, null, false);
                }
            }
            final int i10 = this.Q + 1;
            this.Q = i10;
            final int i11 = org.telegram.messenger.h10.f22829t0;
            ?? r02 = new Runnable() {
                @Override
                public final void run() {
                    int i12;
                    String str5;
                    kg.l0 l0Var2;
                    int i13;
                    long j15;
                    boolean z15;
                    long j16;
                    int i14;
                    TLRPC.MessagesFilter messagesFilter;
                    int i15;
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                    TLRPC.MessagesFilter messagesFilter2;
                    final wz wzVar = wz.this;
                    ArrayList arrayList5 = wzVar.f51645f;
                    final long j17 = j10;
                    int i16 = (j17 > 0L ? 1 : (j17 == 0L ? 0 : -1));
                    long j18 = j11;
                    String str6 = str2;
                    kg.l0 l0Var3 = l0Var;
                    int i17 = i11;
                    long j19 = j12;
                    long j20 = j13;
                    boolean z16 = z14;
                    ArrayList arrayList6 = null;
                    if (i16 != 0 && j18 == 0) {
                        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                        tL_messages_search.f27112q = str6;
                        tL_messages_search.limit = 20;
                        if (l0Var3 == null) {
                            messagesFilter2 = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter2 = l0Var3.f17083e;
                        }
                        tL_messages_search.filter = messagesFilter2;
                        tL_messages_search.peer = org.telegram.messenger.hp.s1(org.telegram.messenger.c.a(i17).f21919a).j1(j17);
                        if (j19 > 0) {
                            tL_messages_search.min_date = (int) (j19 / 1000);
                        }
                        if (j20 > 0) {
                            tL_messages_search.max_date = (int) (j20 / 1000);
                        }
                        if (z16 && str6.equals(wzVar.f51663x) && !arrayList5.isEmpty()) {
                            tL_messages_search.offset_id = ((org.telegram.messenger.zi) k2.p1.h(1, arrayList5)).f1();
                        } else {
                            tL_messages_search.offset_id = 0;
                        }
                        i12 = i17;
                        str5 = str6;
                        l0Var2 = l0Var3;
                        j15 = j19;
                        tL_messages_searchGlobal = tL_messages_search;
                        z15 = z16;
                    } else {
                        boolean isEmpty = TextUtils.isEmpty(str6);
                        boolean z17 = z10;
                        if (!isEmpty) {
                            j15 = j19;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = new ArrayList();
                            z15 = z16;
                            ArrayList arrayList9 = new ArrayList();
                            org.telegram.messenger.qr a02 = org.telegram.messenger.qr.a0(i17);
                            j16 = j20;
                            i12 = i17;
                            str5 = str6;
                            l0Var2 = l0Var3;
                            i14 = 20;
                            a02.M0(0, str5, arrayList7, arrayList8, arrayList9, null, z17 ? 1 : 0);
                            i13 = z17 ? 1 : 0;
                            arrayList6 = arrayList7;
                        } else {
                            i12 = i17;
                            str5 = str6;
                            l0Var2 = l0Var3;
                            i13 = z17 ? 1 : 0;
                            j15 = j19;
                            z15 = z16;
                            j16 = j20;
                            i14 = 20;
                        }
                        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                        tL_messages_searchGlobal2.limit = i14;
                        tL_messages_searchGlobal2.f27114q = str5;
                        if (l0Var2 == null) {
                            messagesFilter = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter = l0Var2.f17083e;
                        }
                        tL_messages_searchGlobal2.filter = messagesFilter;
                        tL_messages_searchGlobal2.community = org.telegram.messenger.hp.s1(i12).h1(j18);
                        if (j15 > 0) {
                            tL_messages_searchGlobal2.min_date = (int) (j15 / 1000);
                        }
                        if (j16 > 0) {
                            tL_messages_searchGlobal2.max_date = (int) (j16 / 1000);
                        }
                        if (z15 && str5.equals(wzVar.f51663x) && !arrayList5.isEmpty()) {
                            i15 = 1;
                            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) k2.p1.h(1, arrayList5);
                            tL_messages_searchGlobal2.offset_id = ziVar.f1();
                            tL_messages_searchGlobal2.offset_rate = wzVar.f51662w;
                            tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.hp.s1(i12).j1(org.telegram.messenger.zi.C1(ziVar.f26868k.peer_id));
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
                    wzVar.f51663x = str5;
                    wzVar.f51664y = str3;
                    final ArrayList arrayList10 = new ArrayList();
                    kg.n0.B1(wzVar.f51663x, arrayList10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                    final boolean z18 = z15;
                    final int i18 = i10;
                    final kg.l0 l0Var4 = l0Var2;
                    final String str7 = str5;
                    final int i19 = i12;
                    final ArrayList arrayList11 = arrayList6;
                    final long j21 = j15;
                    connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new org.telegram.messenger.n10() {
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
                                    org.telegram.messenger.zi ziVar2 = new org.telegram.messenger.zi(i20, messages_messages.messages.get(i21), false, true);
                                    ziVar2.L5(str8, true);
                                    arrayList12.add(ziVar2);
                                }
                            }
                            final wz wzVar2 = wz.this;
                            final int i22 = i18;
                            final boolean z19 = z18;
                            final kg.l0 l0Var5 = l0Var4;
                            final long j22 = j17;
                            final long j23 = j21;
                            final ArrayList arrayList13 = arrayList11;
                            final ArrayList arrayList14 = arrayList10;
                            org.telegram.messenger.g0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iz.run():void");
                                }
                            });
                        }
                    });
                }
            };
            this.f51643e = r02;
            org.telegram.messenger.g0.i3(r02, (!z14 || arrayList.isEmpty()) ? 350L : 350L);
            kz kzVar = this.f51652l0;
            if (l0Var == null) {
                kzVar.setViewType(1);
                return;
            }
            int i12 = l0Var.d;
            if (i12 == 0) {
                if (!TextUtils.isEmpty(this.J)) {
                    kzVar.setViewType(1);
                } else {
                    kzVar.setViewType(2);
                }
            } else if (i12 == 1) {
                kzVar.setViewType(3);
            } else if (i12 != 3 && i12 != 5) {
                if (i12 == 2) {
                    kzVar.setViewType(5);
                }
            } else {
                kzVar.setViewType(4);
            }
        }
    }

    public final void i(nz nzVar, boolean z10) {
        this.f51649i0 = nzVar;
        if (z10 && nzVar != null) {
            ArrayList arrayList = this.f51642d0;
            if (!arrayList.isEmpty()) {
                ((du) nzVar).j(false, arrayList, this.f51644e0, this.f51646f0);
            }
        }
    }

    public final void j(int i3, int i10, boolean z10) {
        setClipToPadding(false);
        this.f51661s0 = z10;
        setPadding(0, i3, 0, i10);
        xs xsVar = this.f51638b;
        if (z10) {
            xsVar.q1(0, i3, 0, i10);
        } else {
            xsVar.setPadding(0, i3, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) xsVar.getLayoutParams();
        marginLayoutParams.topMargin = -i3;
        marginLayoutParams.bottomMargin = -i10;
        this.f51661s0 = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i3 = org.telegram.messenger.h10.f22829t0;
        this.f51659r0 = i3;
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.f23246i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.f(this.f51659r0).n(this, org.telegram.messenger.hs.f23246i4);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        org.telegram.ui.Components.sj0 sj0Var;
        int i11 = this.f51660s;
        if (org.telegram.messenger.g0.Q1()) {
            this.f51660s = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.f51660s = 6;
        } else {
            this.f51660s = 3;
        }
        if (i11 != this.f51660s && (sj0Var = this.d) == this.V) {
            this.f51661s0 = true;
            sj0Var.f();
            this.f51661s0 = false;
        }
        super.onMeasure(i3, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f51661s0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(eh.c cVar) {
        hh.e eVar = new hh.e(null);
        eVar.f14417e = new gi.i8(12);
        eVar.f(385875968, 402653183);
        eVar.e(385875968, 402653183);
        eVar.d(0, 0);
        eVar.f14418f = 1.0f;
        eVar.h = 1.0f;
        oz ozVar = this.f51654n0;
        gh.g c2 = cVar.c(ozVar, eVar, false);
        ozVar.f48384b = c2;
        c2.r(org.telegram.messenger.g0.L(11.5f));
        ozVar.f48384b.q(org.telegram.messenger.g0.L(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.em0 em0Var) {
        this.f51650j0 = em0Var;
    }

    public void setUiCallback(vz vzVar) {
        this.f51656p0 = vzVar;
    }

    public void setUseFromUserAsAvatar(boolean z10) {
        this.f51657q0 = z10;
    }

    @Override
    public final void updateColors() {
        try {
            oz ozVar = this.f51654n0;
            if (ozVar != null) {
                ozVar.updateColors();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void F(float f10, int i3) {
    }
}

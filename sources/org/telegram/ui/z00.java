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
public final class z00 extends FrameLayout implements org.telegram.ui.ActionBar.k6, org.telegram.messenger.us, fe.e {
    public static final SpannableStringBuilder[] f43938s0 = new SpannableStringBuilder[3];
    public zf.e0 D;
    public long E;
    public long F;
    public long G;
    public long H;
    public String I;
    public boolean J;
    public final Activity K;
    public final org.telegram.ui.ActionBar.k2 L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public String Q;
    public int R;
    public final s00 S;
    public final t00 T;
    public final x00 U;
    public final u00 V;
    public final w00 W;
    public final fe.b f43939a;
    public final u00 f43940a0;
    public final ag.b1 f43941b;
    public final u00 f43942b0;
    public final org.telegram.ui.Components.dw0 f43943c;
    public final ArrayList f43944c0;
    public org.telegram.ui.Components.sk0 d;
    public final ArrayList f43945d0;
    public j00 e;
    public boolean f43946e0;
    public final ArrayList f43947f;
    public final m4 f43948f0;
    public final m00 f43949g0;
    public final SparseArray h;
    public q00 f43950h0;
    public org.telegram.ui.Components.cn0 f43951i0;
    public final s4.a0 f43952j0;
    public final n00 f43953k0;
    public final e2.f f43954l0;
    public final r00 m0;
    public final ArrayList f43955n;
    public final zy f43956n0;
    public y00 f43957o0;
    public boolean f43958p0;
    public int f43959q0;
    public final HashMap f43960r;
    public boolean f43961r0;
    public int f43962s;
    public int f43963w;
    public String f43964x;
    public String f43965y;

    public z00(org.telegram.ui.ActionBar.k2 k2Var) {
        super(k2Var.getParentActivity());
        this.f43939a = new fe.b(0, this, org.telegram.ui.Components.gr.h, 380L, false);
        this.f43947f = new ArrayList();
        this.h = new SparseArray();
        this.f43955n = new ArrayList();
        this.f43960r = new HashMap();
        this.f43962s = 3;
        this.S = new s00(0, 0L);
        this.f43944c0 = new ArrayList();
        this.f43945d0 = new ArrayList();
        this.f43948f0 = new m4(this, 5);
        this.f43949g0 = new m00(this);
        this.f43954l0 = new e2.f(null);
        this.f43956n0 = new zy(this, 1);
        this.L = k2Var;
        Activity parentActivity = k2Var.getParentActivity();
        this.K = parentActivity;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, this, null);
        ag.b1 b1Var = new ag.b1(this, parentActivity, 27);
        this.f43941b = b1Var;
        b1Var.setOnItemClickListener(new g(this, 12));
        b1Var.setOnItemLongClickListener(new e(this, 15));
        s4.a0 a0Var = new s4.a0();
        this.f43952j0 = a0Var;
        b1Var.setLayoutManager(a0Var);
        n00 n00Var = new n00(this, parentActivity, 0);
        this.f43953k0 = n00Var;
        addView(n00Var);
        addView(b1Var);
        b1Var.setSectionsType(2);
        b1Var.setSkipDrawSection(true);
        b1Var.setOnScrollListener(new o00(this));
        r00 r00Var = new r00(parentActivity);
        this.m0 = r00Var;
        String u10 = org.telegram.messenger.cd.u((int) (System.currentTimeMillis() / 1000), false);
        if (!TextUtils.equals(r00Var.f41102c, u10)) {
            r00Var.f41102c = u10;
            r00Var.f41100a.t(u10, true, true);
        }
        addView(r00Var, w7.b6.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.T = new t00(this);
        this.U = new x00(this, getContext());
        this.V = new u00(this, getContext(), 1);
        this.W = new w00(this, getContext());
        this.f43940a0 = new u00(this, getContext(), 4);
        this.f43942b0 = new u00(this, getContext(), 2);
        org.telegram.ui.Components.dw0 dw0Var = new org.telegram.ui.Components.dw0(parentActivity, n00Var, 1, null);
        this.f43943c = dw0Var;
        addView(dw0Var);
        b1Var.setEmptyView(dw0Var);
        dw0Var.setVisibility(8);
        b();
    }

    public static void a(z00 z00Var, org.telegram.messenger.jj jjVar, View view, int i10) {
        if (!z00Var.f43957o0.f()) {
            z00Var.f43957o0.a();
        }
        if (z00Var.f43957o0.f()) {
            z00Var.f43957o0.e(jjVar, view, i10);
        }
    }

    public static CharSequence c(org.telegram.messenger.jj jjVar, boolean z10) {
        return d(jjVar, z10, 0, null);
    }

    public static CharSequence d(org.telegram.messenger.jj jjVar, boolean z10, int i10, TextPaint textPaint) {
        TLRPC.Message message;
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        TLRPC.User user2;
        Paint.FontMetricsInt fontMetricsInt;
        TLRPC.TL_forumTopic f7;
        Paint.FontMetricsInt fontMetricsInt2;
        Paint.FontMetricsInt fontMetricsInt3;
        Paint.FontMetricsInt fontMetricsInt4;
        TLRPC.TL_forumTopic f10;
        int i11;
        int i12;
        if (jjVar != null && (message = jjVar.f16337k) != null) {
            if (org.telegram.messenger.jj.b4(message)) {
                ag.h3 c10 = ag.i3.f(jjVar.I1).c(org.telegram.messenger.jj.J1(jjVar.f16337k));
                if (c10 != null) {
                    return c10.f552b;
                }
                return "";
            }
            CharSequence charSequence = null;
            if (jjVar.r4()) {
                if (jjVar.Z0) {
                    return org.telegram.messenger.cd.L0(2131745276, null);
                }
                if (jjVar.S0) {
                    return org.telegram.messenger.cd.L0(2131745277, null);
                }
                return org.telegram.messenger.cd.L0(2131745278, null);
            }
            SpannableStringBuilder[] spannableStringBuilderArr = f43938s0;
            if (spannableStringBuilderArr[i10] == null) {
                spannableStringBuilderArr[i10] = new SpannableStringBuilder(">");
                if (i10 == 0) {
                    i11 = 2131230875;
                } else if (i10 == 1) {
                    i11 = 2131232228;
                } else if (i10 == 2) {
                    i11 = 2131232227;
                } else {
                    return "";
                }
                Drawable mutate = org.telegram.messenger.w0.f19025b.getDrawable(i11).mutate();
                if (i10 == 0) {
                    i12 = 2;
                } else {
                    i12 = 1;
                }
                org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(i12, mutate);
                if (i10 == 1 || i10 == 2) {
                    dqVar.H = 0.85f;
                }
                SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i10];
                spannableStringBuilder.setSpan(dqVar, 0, spannableStringBuilder.length(), 0);
            }
            TLRPC.Message message2 = jjVar.f16337k;
            if (message2.saved_peer_id != null) {
                if (jjVar.Q1() >= 0) {
                    user2 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).Z1(Long.valueOf(jjVar.Q1()));
                    chat = null;
                } else if (jjVar.Q1() < 0) {
                    chat = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).L0(Long.valueOf(-jjVar.Q1()));
                    user2 = null;
                    chat2 = null;
                } else {
                    user2 = null;
                    chat = null;
                }
                chat2 = chat;
            } else {
                if (message2.from_id.user_id != 0) {
                    user = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).Z1(Long.valueOf(jjVar.f16337k.from_id.user_id));
                } else {
                    user = null;
                }
                if (jjVar.f16337k.from_id.chat_id != 0) {
                    chat = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).L0(Long.valueOf(jjVar.f16337k.peer_id.chat_id));
                } else {
                    chat = null;
                }
                if (chat == null) {
                    if (jjVar.f16337k.from_id.channel_id != 0) {
                        chat = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).L0(Long.valueOf(jjVar.f16337k.peer_id.channel_id));
                    } else {
                        chat = null;
                    }
                }
                if (jjVar.f16337k.peer_id.channel_id != 0) {
                    chat2 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).L0(Long.valueOf(jjVar.f16337k.peer_id.channel_id));
                } else {
                    chat2 = null;
                }
                if (chat2 == null) {
                    if (jjVar.f16337k.peer_id.chat_id != 0) {
                        chat2 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).L0(Long.valueOf(jjVar.f16337k.peer_id.chat_id));
                    } else {
                        chat2 = null;
                    }
                }
                if (!org.telegram.messenger.w3.V(chat2) && !z10) {
                    chat2 = null;
                }
                user2 = user;
            }
            if (user2 != null && chat2 != null) {
                CharSequence charSequence2 = chat2.title;
                if (org.telegram.messenger.w3.c0(chat2) && (f10 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).f18891r7.f(chat2.f19793id, org.telegram.messenger.jj.c2(jjVar.I1, jjVar.f16337k, true, false))) != null) {
                    charSequence2 = gg.e.j(f10, null, null);
                }
                if (textPaint == null) {
                    fontMetricsInt3 = null;
                } else {
                    fontMetricsInt3 = textPaint.getFontMetricsInt();
                }
                CharSequence m10 = org.telegram.messenger.k6.m(charSequence2, fontMetricsInt3, false, null, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                String j10 = org.telegram.messenger.h20.j(user2, true);
                if (textPaint == null) {
                    fontMetricsInt4 = null;
                } else {
                    fontMetricsInt4 = textPaint.getFontMetricsInt();
                }
                spannableStringBuilder2.append(org.telegram.messenger.k6.m(j10, fontMetricsInt4, false, null, 0)).append((char) 8202).append((CharSequence) spannableStringBuilderArr[i10]).append((char) 8202).append(m10);
                charSequence = spannableStringBuilder2;
            } else if (user2 != null) {
                String p5 = org.telegram.messenger.h20.p(user2);
                if (textPaint == null) {
                    fontMetricsInt2 = null;
                } else {
                    fontMetricsInt2 = textPaint.getFontMetricsInt();
                }
                charSequence = org.telegram.messenger.k6.m(p5, fontMetricsInt2, false, null, 0);
            } else if (chat != null) {
                CharSequence charSequence3 = chat.title;
                if (org.telegram.messenger.w3.c0(chat) && (f7 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).f18891r7.f(chat.f19793id, org.telegram.messenger.jj.c2(jjVar.I1, jjVar.f16337k, true, false))) != null) {
                    charSequence3 = gg.e.j(f7, null, null);
                }
                if (textPaint == null) {
                    fontMetricsInt = null;
                } else {
                    fontMetricsInt = textPaint.getFontMetricsInt();
                }
                charSequence = org.telegram.messenger.k6.m(charSequence3, fontMetricsInt, false, null, 0);
            }
            if (charSequence != null) {
                return charSequence;
            }
            return "";
        }
        return "";
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21059k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20913c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20932d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.C9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21333z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21314y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21298x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21245u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21172q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21041j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21098m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20988g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21023i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20894b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20874a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.xi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21330z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.pj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.wi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
    }

    public final void b() {
        int i10;
        float f7 = this.f43939a.e;
        float f10 = (1.0f - f7) * (-org.telegram.messenger.i0.L(24.0f));
        r00 r00Var = this.m0;
        r00Var.setTranslationY(f10);
        r00Var.setAlpha(f7);
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        r00Var.setVisibility(i10);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19630i4) {
            ag.b1 b1Var = this.f43941b;
            int childCount = b1Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (b1Var.getChildAt(i12) instanceof org.telegram.ui.Cells.v2) {
                    ((org.telegram.ui.Cells.v2) b1Var.getChildAt(i12)).i0(0, true);
                }
                b1Var.getChildAt(i12).invalidate();
            }
        }
    }

    public final void e(java.util.ArrayList r12, long r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z00.e(java.util.ArrayList, long):void");
    }

    public final void f(int i10, View view, org.telegram.messenger.jj jjVar, int i11) {
        TLRPC.WebPage webPage;
        String str;
        if (jjVar != null) {
            if (this.f43957o0.f()) {
                this.f43957o0.e(jjVar, view, i11);
            } else if (view instanceof org.telegram.ui.Cells.v2) {
                this.f43957o0.c(jjVar);
            } else {
                int i12 = this.D.d;
                m00 m00Var = this.f43949g0;
                ArrayList arrayList = this.f43947f;
                String str2 = null;
                org.telegram.ui.ActionBar.k2 k2Var = this.L;
                if (i12 == 0) {
                    PhotoViewer.v1().N2(null, k2Var, null);
                    PhotoViewer.v1().e2(arrayList, i10, 0L, 0L, 0L, m00Var);
                    this.R = PhotoViewer.v1().f33451c;
                } else if (i12 != 3 && i12 != 5) {
                    if (i12 == 1) {
                        if (view instanceof org.telegram.ui.Cells.l7) {
                            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                            TLRPC.Document F0 = jjVar.F0();
                            if (l7Var.G) {
                                if (jjVar.x()) {
                                    PhotoViewer.v1().N2(null, k2Var, null);
                                    int indexOf = arrayList.indexOf(jjVar);
                                    if (indexOf < 0) {
                                        ArrayList j10 = org.telegram.messenger.m5.j(jjVar);
                                        PhotoViewer.v1().N2(null, k2Var, null);
                                        PhotoViewer.v1().e2(j10, 0, 0L, 0L, 0L, m00Var);
                                        this.R = PhotoViewer.v1().f33451c;
                                        return;
                                    }
                                    PhotoViewer.v1().N2(null, k2Var, null);
                                    PhotoViewer.v1().e2(arrayList, indexOf, 0L, 0L, 0L, m00Var);
                                    this.R = PhotoViewer.v1().f33451c;
                                    return;
                                }
                                org.telegram.messenger.i0.s2(jjVar, this.K, k2Var);
                            } else if (!l7Var.F) {
                                org.telegram.messenger.jj message = l7Var.getMessage();
                                message.P = true;
                                org.telegram.messenger.b8.G(org.telegram.messenger.c.a(org.telegram.messenger.d20.f15147s0).f14863a).X(F0, message, 0, 0);
                                l7Var.f(true);
                            } else {
                                org.telegram.messenger.b8.G(org.telegram.messenger.c.a(org.telegram.messenger.d20.f15147s0).f14863a).f(F0);
                                l7Var.f(true);
                            }
                        }
                    } else if (i12 == 2) {
                        try {
                            TLRPC.MessageMedia messageMedia = jjVar.f16337k.media;
                            if (messageMedia != null) {
                                webPage = messageMedia.webpage;
                            } else {
                                webPage = null;
                            }
                            if (webPage != null && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                                if (webPage.cached_page != null) {
                                    LaunchActivity launchActivity = LaunchActivity.I1;
                                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.I1.O().k(jjVar) == null) {
                                        k2Var.createArticleViewer(false).L(jjVar, null, null, null);
                                        return;
                                    }
                                    return;
                                }
                                String str3 = webPage.embed_url;
                                if (str3 != null && str3.length() != 0) {
                                    org.telegram.ui.Components.hu.K0(this.L, jjVar, this.f43949g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                    return;
                                }
                                str = webPage.url;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                ArrayList arrayList2 = ((org.telegram.ui.Cells.o7) view).E;
                                if (arrayList2.size() > 0) {
                                    str2 = ((CharSequence) arrayList2.get(0)).toString();
                                }
                                str = str2;
                            }
                            if (str != null) {
                                g(str);
                            }
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                    }
                } else if (view instanceof org.telegram.ui.Cells.k7) {
                    ((org.telegram.ui.Cells.k7) view).a();
                }
            }
        }
    }

    public final void g(String str) {
        if (org.telegram.messenger.i0.I3(str)) {
            org.telegram.ui.Components.s4.p0(this.L, str, true, true);
        } else {
            gf.f.r(this.K, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.c7> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.c7> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21001h5));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20872a7));
        int i10 = org.telegram.ui.ActionBar.t6.f21021i7;
        ag.b1 b1Var = this.f43941b;
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 8192, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        int i11 = org.telegram.ui.ActionBar.t6.f21059k7;
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 16384, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 8, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21002h6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 8192, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 16384, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        org.telegram.ui.Components.dw0 dw0Var = this.f43943c;
        arrayList.add(new org.telegram.ui.ActionBar.c7(dw0Var.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(dw0Var.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21311y6));
        return arrayList;
    }

    public final void h(final long j10, final long j11, final long j12, final long j13, final zf.e0 e0Var, final boolean z10, String str, boolean z11) {
        final String str2;
        int i10;
        boolean z12;
        boolean z13;
        ArrayList arrayList;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        Locale locale = Locale.ENGLISH;
        if (e0Var == null) {
            i10 = -1;
        } else {
            i10 = e0Var.d;
        }
        final String str3 = j10 + j11 + j12 + j13 + i10 + str2 + z10;
        String str4 = this.f43965y;
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
        this.D = e0Var;
        this.E = j10;
        this.F = j11;
        this.H = j12;
        this.G = j13;
        this.I = str2;
        this.J = z10;
        j00 j00Var = this.e;
        if (j00Var != null) {
            org.telegram.messenger.i0.r(j00Var);
        }
        m4 m4Var = this.f43948f0;
        org.telegram.messenger.i0.r(m4Var);
        if (!z12 || !z11) {
            ArrayList arrayList2 = this.f43945d0;
            final boolean z14 = z12;
            ArrayList arrayList3 = this.f43944c0;
            org.telegram.ui.Components.dw0 dw0Var = this.f43943c;
            ArrayList arrayList4 = this.f43947f;
            long j14 = 0;
            if (!z13 && (e0Var != null || j11 != 0 || j10 != 0 || j12 != 0 || j13 != 0)) {
                if (!z11 || arrayList4.isEmpty()) {
                    arrayList = arrayList4;
                } else {
                    return;
                }
            } else {
                arrayList4.clear();
                this.f43955n.clear();
                this.f43960r.clear();
                this.M = true;
                dw0Var.setVisibility(0);
                org.telegram.ui.Components.sk0 sk0Var = this.d;
                if (sk0Var != null) {
                    sk0Var.f();
                }
                this.P++;
                ag.b1 b1Var = this.f43941b;
                if (b1Var.getPinnedHeader() != null) {
                    arrayList = arrayList4;
                    b1Var.getPinnedHeader().setAlpha(0.0f);
                } else {
                    arrayList = arrayList4;
                }
                arrayList3.clear();
                arrayList2.clear();
                if (!z13) {
                    return;
                }
            }
            this.M = true;
            org.telegram.ui.Components.sk0 sk0Var2 = this.d;
            if (sk0Var2 != null) {
                sk0Var2.f();
            }
            if (!z14) {
                m4Var.run();
                dw0Var.e(true, !z11);
            }
            if (TextUtils.isEmpty(str2)) {
                arrayList2.clear();
                arrayList3.clear();
                q00 q00Var = this.f43950h0;
                if (q00Var != null) {
                    ((iv) q00Var).k(false, null, null, false);
                }
            }
            final int i11 = this.P + 1;
            this.P = i11;
            final int i12 = org.telegram.messenger.d20.f15147s0;
            ?? r02 = new Runnable() {
                @Override
                public final void run() {
                    int i13;
                    String str5;
                    zf.e0 e0Var2;
                    int i14;
                    long j15;
                    boolean z15;
                    long j16;
                    int i15;
                    TLRPC.MessagesFilter messagesFilter;
                    int i16;
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                    TLRPC.MessagesFilter messagesFilter2;
                    final z00 z00Var = z00.this;
                    ArrayList arrayList5 = z00Var.f43947f;
                    final long j17 = j10;
                    int i17 = (j17 > 0L ? 1 : (j17 == 0L ? 0 : -1));
                    long j18 = j11;
                    String str6 = str2;
                    zf.e0 e0Var3 = e0Var;
                    int i18 = i12;
                    long j19 = j12;
                    long j20 = j13;
                    boolean z16 = z14;
                    ArrayList arrayList6 = null;
                    if (i17 != 0 && j18 == 0) {
                        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                        tL_messages_search.f19904q = str6;
                        tL_messages_search.limit = 20;
                        if (e0Var3 == null) {
                            messagesFilter2 = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter2 = e0Var3.e;
                        }
                        tL_messages_search.filter = messagesFilter2;
                        tL_messages_search.peer = org.telegram.messenger.vp.r1(org.telegram.messenger.c.a(i18).f14863a).i1(j17);
                        if (j19 > 0) {
                            tL_messages_search.min_date = (int) (j19 / 1000);
                        }
                        if (j20 > 0) {
                            tL_messages_search.max_date = (int) (j20 / 1000);
                        }
                        if (z16 && str6.equals(z00Var.f43964x) && !arrayList5.isEmpty()) {
                            tL_messages_search.offset_id = ((org.telegram.messenger.jj) i0.a.g(1, arrayList5)).f1();
                        } else {
                            tL_messages_search.offset_id = 0;
                        }
                        i13 = i18;
                        str5 = str6;
                        e0Var2 = e0Var3;
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
                            org.telegram.messenger.hs a02 = org.telegram.messenger.hs.a0(i18);
                            j16 = j20;
                            i13 = i18;
                            str5 = str6;
                            e0Var2 = e0Var3;
                            i15 = 20;
                            a02.M0(0, str5, arrayList7, arrayList8, arrayList9, null, z17 ? 1 : 0);
                            i14 = z17 ? 1 : 0;
                            arrayList6 = arrayList7;
                        } else {
                            i13 = i18;
                            str5 = str6;
                            e0Var2 = e0Var3;
                            i14 = z17 ? 1 : 0;
                            j15 = j19;
                            z15 = z16;
                            j16 = j20;
                            i15 = 20;
                        }
                        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                        tL_messages_searchGlobal2.limit = i15;
                        tL_messages_searchGlobal2.f19906q = str5;
                        if (e0Var2 == null) {
                            messagesFilter = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter = e0Var2.e;
                        }
                        tL_messages_searchGlobal2.filter = messagesFilter;
                        tL_messages_searchGlobal2.community = org.telegram.messenger.vp.r1(i13).g1(j18);
                        if (j15 > 0) {
                            tL_messages_searchGlobal2.min_date = (int) (j15 / 1000);
                        }
                        if (j16 > 0) {
                            tL_messages_searchGlobal2.max_date = (int) (j16 / 1000);
                        }
                        if (z15 && str5.equals(z00Var.f43964x) && !arrayList5.isEmpty()) {
                            i16 = 1;
                            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) i0.a.g(1, arrayList5);
                            tL_messages_searchGlobal2.offset_id = jjVar.f1();
                            tL_messages_searchGlobal2.offset_rate = z00Var.f43963w;
                            tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.vp.r1(i13).i1(org.telegram.messenger.jj.C1(jjVar.f16337k.peer_id));
                        } else {
                            i16 = 1;
                            tL_messages_searchGlobal2.offset_rate = 0;
                            tL_messages_searchGlobal2.offset_id = 0;
                            tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        }
                        tL_messages_searchGlobal2.flags |= i16;
                        tL_messages_searchGlobal2.folder_id = i14;
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    }
                    z00Var.f43964x = str5;
                    z00Var.f43965y = str3;
                    final ArrayList arrayList10 = new ArrayList();
                    zf.g0.B1(z00Var.f43964x, arrayList10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i13);
                    final boolean z18 = z15;
                    final int i19 = i11;
                    final zf.e0 e0Var4 = e0Var2;
                    final String str7 = str5;
                    final int i20 = i13;
                    final ArrayList arrayList11 = arrayList6;
                    final long j21 = j15;
                    connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new org.telegram.messenger.j20() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                            final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            final ArrayList arrayList12 = new ArrayList();
                            final int i21 = i20;
                            final String str8 = str7;
                            if (tL_error == null) {
                                int size = messages_messages.messages.size();
                                for (int i22 = 0; i22 < size; i22++) {
                                    org.telegram.messenger.jj jjVar2 = new org.telegram.messenger.jj(i21, messages_messages.messages.get(i22), false, true);
                                    jjVar2.J5(str8, true);
                                    arrayList12.add(jjVar2);
                                }
                            }
                            final z00 z00Var2 = z00.this;
                            final int i23 = i19;
                            final boolean z19 = z18;
                            final zf.e0 e0Var5 = e0Var4;
                            final long j22 = j17;
                            final long j23 = j21;
                            final ArrayList arrayList13 = arrayList11;
                            final ArrayList arrayList14 = arrayList10;
                            org.telegram.messenger.i0.g3(new Runnable() {
                                @Override
                                public final void run() {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l00.run():void");
                                }
                            });
                        }
                    });
                }
            };
            this.e = r02;
            org.telegram.messenger.i0.h3(r02, (!z14 || arrayList.isEmpty()) ? 350L : 350L);
            n00 n00Var = this.f43953k0;
            if (e0Var == null) {
                n00Var.setViewType(1);
                return;
            }
            int i13 = e0Var.d;
            if (i13 == 0) {
                if (!TextUtils.isEmpty(this.I)) {
                    n00Var.setViewType(1);
                } else {
                    n00Var.setViewType(2);
                }
            } else if (i13 == 1) {
                n00Var.setViewType(3);
            } else if (i13 != 3 && i13 != 5) {
                if (i13 == 2) {
                    n00Var.setViewType(5);
                }
            } else {
                n00Var.setViewType(4);
            }
        }
    }

    public final void i(q00 q00Var, boolean z10) {
        this.f43950h0 = q00Var;
        if (z10 && q00Var != null) {
            ArrayList arrayList = this.f43944c0;
            if (!arrayList.isEmpty()) {
                ((iv) q00Var).k(false, arrayList, this.f43945d0, this.f43946e0);
            }
        }
    }

    public final void j(int i10, int i11, boolean z10) {
        setClipToPadding(false);
        this.f43961r0 = z10;
        setPadding(0, i10, 0, i11);
        ag.b1 b1Var = this.f43941b;
        if (z10) {
            b1Var.q1(0, i10, 0, i11);
        } else {
            b1Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.f43961r0 = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = org.telegram.messenger.d20.f15147s0;
        this.f43959q0 = i10;
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.f19630i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.f(this.f43959q0).n(this, org.telegram.messenger.zs.f19630i4);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.sk0 sk0Var;
        int i12 = this.f43962s;
        if (org.telegram.messenger.i0.Q1()) {
            this.f43962s = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.f43962s = 6;
        } else {
            this.f43962s = 3;
        }
        if (i12 != this.f43962s && (sk0Var = this.d) == this.U) {
            this.f43961r0 = true;
            sk0Var.f();
            this.f43961r0 = false;
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f43961r0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(tg.b bVar) {
        wg.d dVar = new wg.d(null);
        dVar.e = new xg.a(3);
        dVar.f(385875968, 402653183);
        dVar.e(385875968, 402653183);
        dVar.d(0, 0);
        dVar.f52848f = 1.0f;
        dVar.h = 1.0f;
        r00 r00Var = this.m0;
        vg.f c10 = bVar.c(r00Var, dVar, false);
        r00Var.f41101b = c10;
        c10.q(org.telegram.messenger.i0.L(11.5f));
        r00Var.f41101b.p(org.telegram.messenger.i0.L(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.cn0 cn0Var) {
        this.f43951i0 = cn0Var;
    }

    public void setUiCallback(y00 y00Var) {
        this.f43957o0 = y00Var;
    }

    public void setUseFromUserAsAvatar(boolean z10) {
        this.f43958p0 = z10;
    }

    @Override
    public final void updateColors() {
        try {
            r00 r00Var = this.m0;
            if (r00Var != null) {
                r00Var.updateColors();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 0) {
            b();
        }
    }

    @Override
    public final void E(float f7, int i10) {
    }
}

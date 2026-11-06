package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
public final class w implements Runnable {
    public final int f50864a = 0;
    public final TLObject f50865b;
    public final int f50866c;
    public final boolean d;
    public final Object f50867e;
    public final Object f50868f;
    public final Object h;
    public final Object f50869n;

    public w(g4 g4Var, TLObject tLObject, int i7, TLRPC.WebPage webPage, org.telegram.messenger.ij ijVar, boolean z9, String str) {
        this.f50867e = g4Var;
        this.f50865b = tLObject;
        this.f50866c = i7;
        this.f50868f = webPage;
        this.h = ijVar;
        this.d = z9;
        this.f50869n = str;
    }

    @Override
    public final void run() {
        v4.d1 K;
        int i7 = 0;
        switch (this.f50864a) {
            case 0:
                g4 g4Var = (g4) this.f50867e;
                TLObject tLObject = this.f50865b;
                int i10 = this.f50866c;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.f50868f;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.h;
                boolean z9 = this.d;
                String str = (String) this.f50869n;
                boolean z10 = tLObject instanceof TLRPC.TL_messages_webPage;
                TLRPC.WebPage webPage2 = tLObject;
                if (z10) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    org.telegram.messenger.qp.s1(i10).Y3(tL_messages_webPage.users, false);
                    org.telegram.messenger.qp.s1(i10).S3(tL_messages_webPage.chats, false);
                    webPage2 = tL_messages_webPage.webpage;
                }
                if (webPage2 instanceof TLRPC.TL_webPage) {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) webPage2;
                    if (tL_webPage.cached_page != null) {
                        if (!g4Var.f45827d0.isEmpty() && g4Var.f45827d0.get(0) == webPage) {
                            if (ijVar != null) {
                                ijVar.f23237k.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                tL_messages_messages.messages.add(ijVar.f23237k);
                                org.telegram.messenger.yr.a0(i10).h1(-2, 0, ijVar.f23256p1 ? 1 : 0, org.telegram.messenger.ij.B0(ijVar.f23237k), 0L, tL_messages_messages, false);
                            }
                            if (z9) {
                                g4Var.f45827d0.add(tL_webPage);
                            } else {
                                g4Var.f45827d0.set(0, tL_webPage);
                            }
                            if (g4Var.f45827d0.size() == 1) {
                                org.telegram.messenger.t0.f25555b.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.f27107id).commit();
                                g4Var.c0(z9 ? 1 : 0, tL_webPage, false);
                                if (str != null) {
                                    g4Var.T(str, false);
                                }
                            }
                        }
                        a0.h hVar = new a0.h(1);
                        hVar.k(tL_webPage, tL_webPage.f27107id);
                        org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(i10);
                        if (!org.telegram.messenger.yr.s0(hVar)) {
                            a02.f26688a.c(new org.telegram.messenger.bq(a02, hVar, 0));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (webPage2 instanceof TLRPC.TL_webPageNotModified) {
                    TLRPC.TL_webPageNotModified tL_webPageNotModified = (TLRPC.TL_webPageNotModified) webPage2;
                    TL_iv.Page page = webPage.cached_page;
                    if (page != null) {
                        int i11 = page.views;
                        int i12 = tL_webPageNotModified.cached_page_views;
                        if (i11 != i12) {
                            page.views = i12;
                            page.flags |= 8;
                            while (true) {
                                k3[] k3VarArr = g4Var.f45843u0;
                                if (i7 < k3VarArr.length) {
                                    e4 e4Var = k3VarArr[i7].f47089c;
                                    if (e4Var.E == webPage && (K = g4Var.f45843u0[i7].f47088b.K(e4Var.b() - 1)) != null) {
                                        g4Var.f45843u0[i7].f47089c.y(K);
                                    }
                                    i7++;
                                } else if (ijVar != null) {
                                    TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
                                    tL_messages_messages2.messages.add(ijVar.f23237k);
                                    org.telegram.messenger.yr.a0(i10).h1(-2, 0, ijVar.f23256p1 ? 1 : 0, org.telegram.messenger.ij.B0(ijVar.f23237k), 0L, tL_messages_messages2, false);
                                    return;
                                } else {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            default:
                vf.b bVar = (vf.b) this.f50867e;
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.f50868f;
                TLObject tLObject2 = this.f50865b;
                int i13 = this.f50866c;
                Uri uri = (Uri) this.h;
                Context context = (Context) this.f50869n;
                boolean z11 = this.d;
                if (bVar != null) {
                    bVar.b();
                } else {
                    try {
                        u1VarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    u1VarArr[0] = null;
                }
                if (tLObject2 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject2;
                    org.telegram.messenger.qp.s1(i13).Y3(webpagepreview.users, false);
                    org.telegram.messenger.qp.s1(i13).S3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        TLRPC.WebPage webPage3 = tL_messageMediaWebPage.webpage;
                        if ((webPage3 instanceof TLRPC.TL_webPage) && webPage3.cached_page != null) {
                            org.telegram.messenger.qs.f(i13).k(91, tL_messageMediaWebPage.webpage, uri.toString());
                            return;
                        }
                    }
                }
                vf.c.q(context, uri, z11, false);
                return;
        }
    }

    public w(vf.b bVar, org.telegram.ui.ActionBar.u1[] u1VarArr, TLObject tLObject, int i7, Uri uri, Context context, boolean z9) {
        this.f50867e = bVar;
        this.f50868f = u1VarArr;
        this.f50865b = tLObject;
        this.f50866c = i7;
        this.h = uri;
        this.f50869n = context;
        this.d = z9;
    }
}

package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
public final class x implements Runnable {
    public final int f51665a = 0;
    public final TLObject f51666b;
    public final int f51667c;
    public final boolean d;
    public final Object f51668e;
    public final Object f51669f;
    public final Object h;
    public final Object f51670n;

    public x(i4 i4Var, TLObject tLObject, int i3, TLRPC.WebPage webPage, org.telegram.messenger.zi ziVar, boolean z10, String str) {
        this.f51668e = i4Var;
        this.f51666b = tLObject;
        this.f51667c = i3;
        this.f51669f = webPage;
        this.h = ziVar;
        this.d = z10;
        this.f51670n = str;
    }

    @Override
    public final void run() {
        u4.d1 K;
        int i3 = 0;
        switch (this.f51665a) {
            case 0:
                i4 i4Var = (i4) this.f51668e;
                TLObject tLObject = this.f51666b;
                int i10 = this.f51667c;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.f51669f;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) this.h;
                boolean z10 = this.d;
                String str = (String) this.f51670n;
                boolean z11 = tLObject instanceof TLRPC.TL_messages_webPage;
                TLRPC.WebPage webPage2 = tLObject;
                if (z11) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    org.telegram.messenger.hp.s1(i10).Y3(tL_messages_webPage.users, false);
                    org.telegram.messenger.hp.s1(i10).S3(tL_messages_webPage.chats, false);
                    webPage2 = tL_messages_webPage.webpage;
                }
                if (webPage2 instanceof TLRPC.TL_webPage) {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) webPage2;
                    if (tL_webPage.cached_page != null) {
                        if (!i4Var.f46084e0.isEmpty() && i4Var.f46084e0.get(0) == webPage) {
                            if (ziVar != null) {
                                ziVar.f26868k.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                tL_messages_messages.messages.add(ziVar.f26868k);
                                org.telegram.messenger.qr.a0(i10).h1(-2, 0, ziVar.f26887p1 ? 1 : 0, org.telegram.messenger.zi.B0(ziVar.f26868k), 0L, tL_messages_messages, false);
                            }
                            if (z10) {
                                i4Var.f46084e0.add(tL_webPage);
                            } else {
                                i4Var.f46084e0.set(0, tL_webPage);
                            }
                            if (i4Var.f46084e0.size() == 1) {
                                org.telegram.messenger.t0.f25457b.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.f27156id).commit();
                                i4Var.c0(z10 ? 1 : 0, tL_webPage, false);
                                if (str != null) {
                                    i4Var.T(str, false);
                                }
                            }
                        }
                        a0.h hVar = new a0.h(1);
                        hVar.k(tL_webPage, tL_webPage.f27156id);
                        org.telegram.messenger.qr a02 = org.telegram.messenger.qr.a0(i10);
                        if (!org.telegram.messenger.qr.s0(hVar)) {
                            a02.f24934a.c(new org.telegram.messenger.sp(a02, hVar, 0));
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
                                l3[] l3VarArr = i4Var.f46100v0;
                                if (i3 < l3VarArr.length) {
                                    g4 g4Var = l3VarArr[i3].f47084c;
                                    if (g4Var.F == webPage && (K = i4Var.f46100v0[i3].f47083b.K(g4Var.b() - 1)) != null) {
                                        i4Var.f46100v0[i3].f47084c.y(K);
                                    }
                                    i3++;
                                } else if (ziVar != null) {
                                    TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
                                    tL_messages_messages2.messages.add(ziVar.f26868k);
                                    org.telegram.messenger.qr.a0(i10).h1(-2, 0, ziVar.f26887p1 ? 1 : 0, org.telegram.messenger.zi.B0(ziVar.f26868k), 0L, tL_messages_messages2, false);
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
                sf.b bVar = (sf.b) this.f51668e;
                org.telegram.ui.ActionBar.s1[] s1VarArr = (org.telegram.ui.ActionBar.s1[]) this.f51669f;
                TLObject tLObject2 = this.f51666b;
                int i13 = this.f51667c;
                Uri uri = (Uri) this.h;
                Context context = (Context) this.f51670n;
                boolean z12 = this.d;
                if (bVar != null) {
                    bVar.b();
                } else {
                    try {
                        s1VarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    s1VarArr[0] = null;
                }
                if (tLObject2 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject2;
                    org.telegram.messenger.hp.s1(i13).Y3(webpagepreview.users, false);
                    org.telegram.messenger.hp.s1(i13).S3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        TLRPC.WebPage webPage3 = tL_messageMediaWebPage.webpage;
                        if ((webPage3 instanceof TLRPC.TL_webPage) && webPage3.cached_page != null) {
                            org.telegram.messenger.hs.f(i13).k(91, tL_messageMediaWebPage.webpage, uri.toString());
                            return;
                        }
                    }
                }
                sf.c.q(context, uri, z12, false);
                return;
        }
    }

    public x(sf.b bVar, org.telegram.ui.ActionBar.s1[] s1VarArr, TLObject tLObject, int i3, Uri uri, Context context, boolean z10) {
        this.f51668e = bVar;
        this.f51669f = s1VarArr;
        this.f51666b = tLObject;
        this.f51667c = i3;
        this.h = uri;
        this.f51670n = context;
        this.d = z10;
    }
}

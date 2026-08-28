package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
public final class y implements Runnable {
    public final int f44658a = 0;
    public final TLObject f44659b;
    public final int f44660c;
    public final boolean d;
    public final Object f44661e;
    public final Object f44662f;
    public final Object h;
    public final Object f44663n;

    public y(l4 l4Var, TLObject tLObject, int i9, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.f44661e = l4Var;
        this.f44659b = tLObject;
        this.f44660c = i9;
        this.f44662f = webPage;
        this.h = messageObject;
        this.d = z10;
        this.f44663n = str;
    }

    @Override
    public final void run() {
        f2.q1 K;
        int i9 = 0;
        switch (this.f44658a) {
            case 0:
                l4 l4Var = (l4) this.f44661e;
                TLObject tLObject = this.f44659b;
                int i10 = this.f44660c;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.f44662f;
                MessageObject messageObject = (MessageObject) this.h;
                boolean z10 = this.d;
                String str = (String) this.f44663n;
                boolean z11 = tLObject instanceof TLRPC.TL_messages_webPage;
                TLRPC.WebPage webPage2 = tLObject;
                if (z11) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i10).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i10).putChats(tL_messages_webPage.chats, false);
                    webPage2 = tL_messages_webPage.webpage;
                }
                if (webPage2 instanceof TLRPC.TL_webPage) {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) webPage2;
                    if (tL_webPage.cached_page != null) {
                        if (!l4Var.Z.isEmpty() && l4Var.Z.get(0) == webPage) {
                            if (messageObject != null) {
                                messageObject.messageOwner.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                tL_messages_messages.messages.add(messageObject.messageOwner);
                                MessagesStorage.getInstance(i10).putMessages((TLRPC.messages_Messages) tL_messages_messages, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
                            }
                            if (z10) {
                                l4Var.Z.add(tL_webPage);
                            } else {
                                l4Var.Z.set(0, tL_webPage);
                            }
                            if (l4Var.Z.size() == 1) {
                                ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.f22533id).commit();
                                l4Var.e0(z10 ? 1 : 0, tL_webPage, false);
                                if (str != null) {
                                    l4Var.V(str, false);
                                }
                            }
                        }
                        a0.h hVar = new a0.h(1);
                        hVar.k(tL_webPage, tL_webPage.f22533id);
                        MessagesStorage.getInstance(i10).putWebPages(hVar);
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
                                p3[] p3VarArr = l4Var.f40026q0;
                                if (i9 < p3VarArr.length) {
                                    j4 j4Var = p3VarArr[i9].f41321c;
                                    if (j4Var.A == webPage && (K = l4Var.f40026q0[i9].f41320b.K(j4Var.h() - 1)) != null) {
                                        l4Var.f40026q0[i9].f41321c.y(K);
                                    }
                                    i9++;
                                } else if (messageObject != null) {
                                    TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
                                    tL_messages_messages2.messages.add(messageObject.messageOwner);
                                    MessagesStorage.getInstance(i10).putMessages((TLRPC.messages_Messages) tL_messages_messages2, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
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
                ve.d dVar = (ve.d) this.f44661e;
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.f44662f;
                TLObject tLObject2 = this.f44659b;
                int i13 = this.f44660c;
                Uri uri = (Uri) this.h;
                Context context = (Context) this.f44663n;
                boolean z12 = this.d;
                if (dVar != null) {
                    dVar.b();
                } else {
                    try {
                        c2VarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    c2VarArr[0] = null;
                }
                if (tLObject2 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject2;
                    MessagesController.getInstance(i13).putUsers(webpagepreview.users, false);
                    MessagesController.getInstance(i13).putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        TLRPC.WebPage webPage3 = tL_messageMediaWebPage.webpage;
                        if ((webPage3 instanceof TLRPC.TL_webPage) && webPage3.cached_page != null) {
                            NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, tL_messageMediaWebPage.webpage, uri.toString());
                            return;
                        }
                    }
                }
                ve.e.p(context, uri, z12, false);
                return;
        }
    }

    public y(ve.d dVar, org.telegram.ui.ActionBar.c2[] c2VarArr, TLObject tLObject, int i9, Uri uri, Context context, boolean z10) {
        this.f44661e = dVar;
        this.f44662f = c2VarArr;
        this.f44659b = tLObject;
        this.f44660c = i9;
        this.h = uri;
        this.f44663n = context;
        this.d = z10;
    }
}

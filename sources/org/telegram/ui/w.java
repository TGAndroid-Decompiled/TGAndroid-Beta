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
public final class w implements Runnable {
    public final int f44931a = 0;
    public final TLObject f44932b;
    public final int f44933c;
    public final boolean d;
    public final Object e;
    public final Object f44934f;
    public final Object h;
    public final Object f44935n;

    public w(j4 j4Var, TLObject tLObject, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.e = j4Var;
        this.f44932b = tLObject;
        this.f44933c = i10;
        this.f44934f = webPage;
        this.h = messageObject;
        this.d = z10;
        this.f44935n = str;
    }

    @Override
    public final void run() {
        s4.e1 K;
        int i10 = 0;
        switch (this.f44931a) {
            case 0:
                j4 j4Var = (j4) this.e;
                TLObject tLObject = this.f44932b;
                int i11 = this.f44933c;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.f44934f;
                MessageObject messageObject = (MessageObject) this.h;
                boolean z10 = this.d;
                String str = (String) this.f44935n;
                boolean z11 = tLObject instanceof TLRPC.TL_messages_webPage;
                TLRPC.WebPage webPage2 = tLObject;
                if (z11) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i11).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i11).putChats(tL_messages_webPage.chats, false);
                    webPage2 = tL_messages_webPage.webpage;
                }
                if (webPage2 instanceof TLRPC.TL_webPage) {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) webPage2;
                    if (tL_webPage.cached_page != null) {
                        if (!j4Var.f40433d0.isEmpty() && j4Var.f40433d0.get(0) == webPage) {
                            if (messageObject != null) {
                                messageObject.messageOwner.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                tL_messages_messages.messages.add(messageObject.messageOwner);
                                MessagesStorage.getInstance(i11).putMessages((TLRPC.messages_Messages) tL_messages_messages, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
                            }
                            if (z10) {
                                j4Var.f40433d0.add(tL_webPage);
                            } else {
                                j4Var.f40433d0.set(0, tL_webPage);
                            }
                            if (j4Var.f40433d0.size() == 1) {
                                ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.f22182id).commit();
                                j4Var.e0(z10 ? 1 : 0, tL_webPage, false);
                                if (str != null) {
                                    j4Var.V(str, false);
                                }
                            }
                        }
                        a0.h hVar = new a0.h(1);
                        hVar.k(tL_webPage, tL_webPage.f22182id);
                        MessagesStorage.getInstance(i11).putWebPages(hVar);
                        return;
                    }
                    return;
                } else if (webPage2 instanceof TLRPC.TL_webPageNotModified) {
                    TLRPC.TL_webPageNotModified tL_webPageNotModified = (TLRPC.TL_webPageNotModified) webPage2;
                    TL_iv.Page page = webPage.cached_page;
                    if (page != null) {
                        int i12 = page.views;
                        int i13 = tL_webPageNotModified.cached_page_views;
                        if (i12 != i13) {
                            page.views = i13;
                            page.flags |= 8;
                            while (true) {
                                m3[] m3VarArr = j4Var.f40449u0;
                                if (i10 < m3VarArr.length) {
                                    h4 h4Var = m3VarArr[i10].f41444c;
                                    if (h4Var.E == webPage && (K = j4Var.f40449u0[i10].f41443b.K(h4Var.h() - 1)) != null) {
                                        j4Var.f40449u0[i10].f41444c.y(K);
                                    }
                                    i10++;
                                } else if (messageObject != null) {
                                    TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
                                    tL_messages_messages2.messages.add(messageObject.messageOwner);
                                    MessagesStorage.getInstance(i11).putMessages((TLRPC.messages_Messages) tL_messages_messages2, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
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
                qf.c cVar = (qf.c) this.e;
                org.telegram.ui.ActionBar.e2[] e2VarArr = (org.telegram.ui.ActionBar.e2[]) this.f44934f;
                TLObject tLObject2 = this.f44932b;
                int i14 = this.f44933c;
                Uri uri = (Uri) this.h;
                Context context = (Context) this.f44935n;
                boolean z12 = this.d;
                if (cVar != null) {
                    cVar.b();
                } else {
                    try {
                        e2VarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    e2VarArr[0] = null;
                }
                if (tLObject2 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject2;
                    MessagesController.getInstance(i14).putUsers(webpagepreview.users, false);
                    MessagesController.getInstance(i14).putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        TLRPC.WebPage webPage3 = tL_messageMediaWebPage.webpage;
                        if ((webPage3 instanceof TLRPC.TL_webPage) && webPage3.cached_page != null) {
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, tL_messageMediaWebPage.webpage, uri.toString());
                            return;
                        }
                    }
                }
                qf.d.o(context, uri, z12, false);
                return;
        }
    }

    public w(qf.c cVar, org.telegram.ui.ActionBar.e2[] e2VarArr, TLObject tLObject, int i10, Uri uri, Context context, boolean z10) {
        this.e = cVar;
        this.f44934f = e2VarArr;
        this.f44932b = tLObject;
        this.f44933c = i10;
        this.h = uri;
        this.f44935n = context;
        this.d = z10;
    }
}

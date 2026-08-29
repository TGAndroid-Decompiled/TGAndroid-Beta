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
public final class z implements Runnable {
    public final int f44998a = 0;
    public final TLObject f44999b;
    public final int f45000c;
    public final boolean d;
    public final Object f45001e;
    public final Object f45002f;
    public final Object h;
    public final Object f45003n;

    public z(m4 m4Var, TLObject tLObject, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.f45001e = m4Var;
        this.f44999b = tLObject;
        this.f45000c = i10;
        this.f45002f = webPage;
        this.h = messageObject;
        this.d = z10;
        this.f45003n = str;
    }

    @Override
    public final void run() {
        f2.n1 K;
        int i10 = 0;
        switch (this.f44998a) {
            case 0:
                m4 m4Var = (m4) this.f45001e;
                TLObject tLObject = this.f44999b;
                int i11 = this.f45000c;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.f45002f;
                MessageObject messageObject = (MessageObject) this.h;
                boolean z10 = this.d;
                String str = (String) this.f45003n;
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
                        if (!m4Var.Z.isEmpty() && m4Var.Z.get(0) == webPage) {
                            if (messageObject != null) {
                                messageObject.messageOwner.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                tL_messages_messages.messages.add(messageObject.messageOwner);
                                MessagesStorage.getInstance(i11).putMessages((TLRPC.messages_Messages) tL_messages_messages, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
                            }
                            if (z10) {
                                m4Var.Z.add(tL_webPage);
                            } else {
                                m4Var.Z.set(0, tL_webPage);
                            }
                            if (m4Var.Z.size() == 1) {
                                ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.f22545id).commit();
                                m4Var.e0(z10 ? 1 : 0, tL_webPage, false);
                                if (str != null) {
                                    m4Var.V(str, false);
                                }
                            }
                        }
                        a0.h hVar = new a0.h(1);
                        hVar.k(tL_webPage, tL_webPage.f22545id);
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
                                q3[] q3VarArr = m4Var.f40404q0;
                                if (i10 < q3VarArr.length) {
                                    k4 k4Var = q3VarArr[i10].f41514c;
                                    if (k4Var.A == webPage && (K = m4Var.f40404q0[i10].f41513b.K(k4Var.h() - 1)) != null) {
                                        m4Var.f40404q0[i10].f41514c.y(K);
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
                ye.c cVar = (ye.c) this.f45001e;
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.f45002f;
                TLObject tLObject2 = this.f44999b;
                int i14 = this.f45000c;
                Uri uri = (Uri) this.h;
                Context context = (Context) this.f45003n;
                boolean z12 = this.d;
                if (cVar != null) {
                    cVar.b();
                } else {
                    try {
                        c2VarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    c2VarArr[0] = null;
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
                ye.d.p(context, uri, z12, false);
                return;
        }
    }

    public z(ye.c cVar, org.telegram.ui.ActionBar.c2[] c2VarArr, TLObject tLObject, int i10, Uri uri, Context context, boolean z10) {
        this.f45001e = cVar;
        this.f45002f = c2VarArr;
        this.f44999b = tLObject;
        this.f45000c = i10;
        this.h = uri;
        this.f45003n = context;
        this.d = z10;
    }
}

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
    public final int f40363a = 0;
    public final TLObject f40364b;
    public final int f40365c;
    public final boolean d;
    public final Object e;
    public final Object f40366f;
    public final Object h;
    public final Object f40367n;

    public z(n4 n4Var, TLObject tLObject, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z4, String str) {
        this.e = n4Var;
        this.f40364b = tLObject;
        this.f40365c = i10;
        this.f40366f = webPage;
        this.h = messageObject;
        this.d = z4;
        this.f40367n = str;
    }

    @Override
    public final void run() {
        f2.l1 K;
        int i10 = 0;
        switch (this.f40363a) {
            case 0:
                n4 n4Var = (n4) this.e;
                TLObject tLObject = this.f40364b;
                int i11 = this.f40365c;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.f40366f;
                MessageObject messageObject = (MessageObject) this.h;
                boolean z4 = this.d;
                String str = (String) this.f40367n;
                boolean z10 = tLObject instanceof TLRPC.TL_messages_webPage;
                TLRPC.WebPage webPage2 = tLObject;
                if (z10) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i11).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i11).putChats(tL_messages_webPage.chats, false);
                    webPage2 = tL_messages_webPage.webpage;
                }
                if (webPage2 instanceof TLRPC.TL_webPage) {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) webPage2;
                    if (tL_webPage.cached_page != null) {
                        if (!n4Var.f36359a0.isEmpty() && n4Var.f36359a0.get(0) == webPage) {
                            if (messageObject != null) {
                                messageObject.messageOwner.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                tL_messages_messages.messages.add(messageObject.messageOwner);
                                MessagesStorage.getInstance(i11).putMessages((TLRPC.messages_Messages) tL_messages_messages, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
                            }
                            if (z4) {
                                n4Var.f36359a0.add(tL_webPage);
                            } else {
                                n4Var.f36359a0.set(0, tL_webPage);
                            }
                            if (n4Var.f36359a0.size() == 1) {
                                ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.f19312id).commit();
                                n4Var.e0(z4 ? 1 : 0, tL_webPage, false);
                                if (str != null) {
                                    n4Var.V(str, false);
                                }
                            }
                        }
                        a0.h hVar = new a0.h(1);
                        hVar.k(tL_webPage, tL_webPage.f19312id);
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
                                r3[] r3VarArr = n4Var.f36375r0;
                                if (i10 < r3VarArr.length) {
                                    l4 l4Var = r3VarArr[i10].f37685c;
                                    if (l4Var.B == webPage && (K = n4Var.f36375r0[i10].f37684b.K(l4Var.h() - 1)) != null) {
                                        n4Var.f36375r0[i10].f37685c.y(K);
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
                ze.c cVar = (ze.c) this.e;
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) this.f40366f;
                TLObject tLObject2 = this.f40364b;
                int i14 = this.f40365c;
                Uri uri = (Uri) this.h;
                Context context = (Context) this.f40367n;
                boolean z11 = this.d;
                if (cVar != null) {
                    cVar.b();
                } else {
                    try {
                        d2VarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    d2VarArr[0] = null;
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
                ze.d.p(context, uri, z11, false);
                return;
        }
    }

    public z(ze.c cVar, org.telegram.ui.ActionBar.d2[] d2VarArr, TLObject tLObject, int i10, Uri uri, Context context, boolean z4) {
        this.e = cVar;
        this.f40366f = d2VarArr;
        this.f40364b = tLObject;
        this.f40365c = i10;
        this.h = uri;
        this.f40367n = context;
        this.d = z4;
    }
}

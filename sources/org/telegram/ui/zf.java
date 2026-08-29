package org.telegram.ui;

import android.text.style.CharacterStyle;
import java.io.Serializable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class zf implements Utilities.Callback2 {
    public final int f45200a = 0;
    public final tn f45201b;
    public final org.telegram.ui.Cells.s1 f45202c;
    public final ye.c d;
    public final Serializable f45203e;
    public final Object f45204f;

    public zf(tn tnVar, qi qiVar, org.telegram.ui.Cells.s1 s1Var, String str, CharacterStyle characterStyle) {
        this.f45201b = tnVar;
        this.d = qiVar;
        this.f45202c = s1Var;
        this.f45203e = str;
        this.f45204f = characterStyle;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        long j10;
        Boolean bool;
        boolean z12;
        int i10;
        int i11;
        int i12;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        org.telegram.ui.Cells.s1 s1Var;
        switch (this.f45200a) {
            case 0:
                String str = (String) this.f45203e;
                CharacterStyle characterStyle = (CharacterStyle) this.f45204f;
                TLObject tLObject = (TLObject) obj;
                Boolean bool2 = (Boolean) obj2;
                this.d.b();
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).f22539id;
                    z10 = false;
                    z11 = true;
                } else if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    z10 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j10 = -chat.f22392id;
                    z11 = false;
                } else {
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                }
                tn tnVar = this.f45201b;
                org.telegram.ui.Cells.s1 s1Var2 = this.f45202c;
                org.telegram.ui.Components.j70 I = org.telegram.ui.Components.j70.I(tnVar, s1Var2);
                org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(tnVar.getParentActivity(), tnVar.f42746aa);
                I.f29595p = new ie(yl0Var, 0);
                int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i13 != 0) {
                    if (z10) {
                        i11 = R.drawable.msg_channel;
                    } else {
                        i11 = R.drawable.msg_discussion;
                    }
                    if (z10) {
                        i12 = R.string.ViewChannel;
                    } else {
                        i12 = R.string.SendMessage;
                    }
                    bool = bool2;
                    z12 = false;
                    I.c(i11, LocaleController.getString(i12), new eg.z0(tnVar, j10, 5), false);
                } else {
                    bool = bool2;
                    z12 = false;
                }
                boolean z13 = z10;
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new oe(tnVar, yl0Var, str, 1), z12);
                if (bool.booleanValue()) {
                    I.c(R.drawable.outline_gram_24, LocaleController.getString(R.string.BuyUsernameOnFragment), new je(tnVar, str, 11), z12);
                }
                I.k();
                if (i13 != 0) {
                    if (z11) {
                        i10 = R.string.ViewProfile;
                    } else if (z13) {
                        i10 = R.string.ViewChannelProfile;
                    } else {
                        i10 = R.string.ViewGroupProfile;
                    }
                    I.n(tLObject, LocaleController.getString(i10), new eg.z0(tnVar, j10, 6));
                } else {
                    I.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.NoUsernameFound2));
                }
                yl0Var.e(I);
                yl0Var.f(s1Var2, characterStyle, null, false);
                tnVar.showDialog(yl0Var);
                return;
            default:
                ri riVar = (ri) this.d;
                int[] iArr = (int[]) this.f45203e;
                MessageObject messageObject = (MessageObject) this.f45204f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                tn tnVar2 = this.f45201b;
                if (tnVar2.f43024wb == riVar) {
                    iArr[0] = 0;
                    riVar.c(false);
                    if (messages_messages != null) {
                        tnVar2.getMessagesController().putUsers(messages_messages.users, false);
                        tnVar2.getMessagesController().putChats(messages_messages.chats, false);
                        int i14 = 0;
                        while (true) {
                            if (i14 < messages_messages.messages.size()) {
                                TLRPC.Message message2 = messages_messages.messages.get(i14);
                                if (message2 == null || (richMessage = message2.rich_message) == null) {
                                    i14++;
                                }
                            } else {
                                richMessage = null;
                            }
                        }
                        if (richMessage != null && (message = messageObject.messageOwner) != null) {
                            message.rich_message = richMessage;
                            messageObject.richLayout = null;
                            fn fnVar = tnVar2.lc;
                            if (fnVar != null && (s1Var = this.f45202c) != null) {
                                fnVar.i(s1Var, true, false, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public zf(tn tnVar, ri riVar, int[] iArr, org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        this.f45201b = tnVar;
        this.d = riVar;
        this.f45203e = iArr;
        this.f45202c = s1Var;
        this.f45204f = messageObject;
    }
}

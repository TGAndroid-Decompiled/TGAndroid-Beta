package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

public final class t80 implements Runnable {

    public final int f42810a = 1;

    public final LaunchActivity f42811b;

    public final byte[] f42812c;
    public final int d;

    public final Integer f42813e;

    public final String f42814f;
    public final int h;

    public final long f42815n;

    public final Object f42816r;

    public final Object f42817s;
    public final Object v;

    public t80(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j10, m0 m0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f42811b = launchActivity;
        this.f42816r = bundle;
        this.f42812c = bArr;
        this.d = i10;
        this.f42813e = num;
        this.f42814f = str;
        this.h = i11;
        this.f42815n = j10;
        this.f42817s = m0Var;
        this.v = n2Var;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10 = this.f42810a;
        int i11 = 0;
        Object obj = this.v;
        Object obj2 = this.f42817s;
        Object obj3 = this.f42816r;
        switch (i10) {
            case 0:
                TLObject tLObject = (TLObject) obj3;
                Integer num = (Integer) obj2;
                Runnable runnable = (Runnable) obj;
                Pattern pattern = LaunchActivity.f35496x1;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    ArrayList<TLRPC.Message> arrayList = ((TLRPC.messages_Messages) tLObject).messages;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            message = null;
                        } else if (arrayList.get(i11) == null || arrayList.get(i11).f22401id != this.f42813e.intValue()) {
                            i11++;
                        } else {
                            message = arrayList.get(i11);
                        }
                    }
                } else {
                    message = null;
                }
                LaunchActivity launchActivity = this.f42811b;
                long j10 = this.f42815n;
                if (message == null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -j10);
                    launchActivity.p0(we1.F0(launchActivity, bundle));
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    int i12 = launchActivity.K;
                    Integer numValueOf = Integer.valueOf(message.f22401id);
                    int i13 = launchActivity.K;
                    launchActivity.v0(i12, null, numValueOf, null, Long.valueOf(MessageObject.getTopicId(i13, message, MessagesController.getInstance(i13).isForum(message))), num, this.f42812c, MessagesController.getInstance(launchActivity.K).getChat(Long.valueOf(-j10)), runnable, this.f42814f, this.d, this.h);
                }
                break;
            default:
                final Bundle bundle2 = (Bundle) obj3;
                final m0 m0Var = (m0) obj2;
                final org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                Pattern pattern2 = LaunchActivity.f35496x1;
                final LaunchActivity launchActivity2 = this.f42811b;
                launchActivity2.getClass();
                final rn rnVar = new rn(bundle2);
                final byte[] bArr = this.f42812c;
                final int i14 = this.d;
                final Integer num2 = this.f42813e;
                final String str = this.f42814f;
                final int i15 = this.h;
                if (bArr != null) {
                    rnVar.N7 = bArr;
                    rnVar.H7 = i14;
                } else if (num2 != null) {
                    rnVar.M7 = num2;
                    rnVar.H7 = i14;
                } else {
                    rnVar.mb(i14, i15, str);
                }
                if (!((ActionBarLayout) (AndroidUtilities.isTablet() ? launchActivity2.f35525o0 : launchActivity2.O())).P(rnVar)) {
                    final long j11 = this.f42815n;
                    if (j11 < 0) {
                        TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                        TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                        tL_inputChannel.channel_id = -j11;
                        tL_channels_getChannels.f22416id.add(tL_inputChannel);
                        m0Var.f49293b = new d80(launchActivity2, ConnectionsManager.getInstance(launchActivity2.K).sendRequest(tL_channels_getChannels, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error) {
                                Pattern pattern3 = LaunchActivity.f35496x1;
                                final LaunchActivity launchActivity3 = launchActivity2;
                                launchActivity3.getClass();
                                final m0 m0Var2 = m0Var;
                                final long j12 = j11;
                                final int i16 = i14;
                                final Integer num3 = num2;
                                final byte[] bArr2 = bArr;
                                final org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                                final Bundle bundle3 = bundle2;
                                final rn rnVar2 = rnVar;
                                final String str2 = str;
                                final int i17 = i15;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        Pattern pattern4 = LaunchActivity.f35496x1;
                                        LaunchActivity launchActivity4 = launchActivity3;
                                        launchActivity4.getClass();
                                        m0Var2.c(false);
                                        TLObject tLObject3 = tLObject2;
                                        if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                            TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject3;
                                            if (!tL_messages_chats.chats.isEmpty()) {
                                                MessagesController.getInstance(launchActivity4.K).putChats(tL_messages_chats.chats, false);
                                                TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                                                int i18 = i16;
                                                if (chat != null && chat.forum) {
                                                    launchActivity4.k0(-j12, Integer.valueOf(i18), null, num3, bArr2, null, 0, -1);
                                                }
                                                org.telegram.ui.ActionBar.n2 n2Var3 = n2Var2;
                                                Bundle bundle4 = bundle3;
                                                if (n2Var3 == null || MessagesController.getInstance(launchActivity4.K).checkCanOpenChat(bundle4, n2Var3)) {
                                                    rn rnVar3 = new rn(bundle4);
                                                    rnVar2.mb(i18, i17, str2);
                                                    ((ActionBarLayout) launchActivity4.O()).P(rnVar3);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        launchActivity4.B0(org.telegram.ui.Components.y4.H(launchActivity4, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                                    }
                                });
                            }
                        }), 1);
                    }
                }
                m0Var.c(false);
                break;
        }
    }

    public t80(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j10, Runnable runnable, String str, int i10, int i11) {
        this.f42811b = launchActivity;
        this.f42816r = tLObject;
        this.f42813e = num;
        this.f42817s = num2;
        this.f42812c = bArr;
        this.f42815n = j10;
        this.v = runnable;
        this.f42814f = str;
        this.d = i10;
        this.h = i11;
    }
}

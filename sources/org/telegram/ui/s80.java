package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class s80 implements Runnable {
    public final int f42578a = 1;
    public final LaunchActivity f42579b;
    public final Bundle f42580c;
    public final Long d;
    public final x20 f42581e;
    public final boolean f42582f;
    public final ve.d h;
    public final Long f42583n;
    public final Integer f42584r;
    public final Integer f42585s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.o2 f42586w;
    public final int f42587x;
    public final Object f42588y;

    public s80(LaunchActivity launchActivity, Bundle bundle, Long l10, int[] iArr, x20 x20Var, boolean z10, ve.d dVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, int i9) {
        this.f42579b = launchActivity;
        this.f42580c = bundle;
        this.d = l10;
        this.f42588y = iArr;
        this.f42581e = x20Var;
        this.f42582f = z10;
        this.h = dVar;
        this.f42583n = l11;
        this.f42584r = num;
        this.f42585s = num2;
        this.v = bArr;
        this.f42586w = o2Var;
        this.f42587x = i9;
    }

    @Override
    public final void run() {
        int i9 = this.f42578a;
        Object obj = this.f42588y;
        switch (i9) {
            case 0:
                x20 x20Var = this.f42581e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.f35493x1;
                try {
                    x20Var.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f42579b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.K).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l10 = this.d;
                        if (chat != null && this.f42582f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l10.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l11 = this.f42583n;
                            Integer num = this.f42585s;
                            byte[] bArr = this.v;
                            if (l11 != null) {
                                launchActivity.k0(-l10.longValue(), this.f42584r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l10.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.o2 o2Var = this.f42586w;
                        Bundle bundle = this.f42580c;
                        if (o2Var == null || MessagesController.getInstance(this.f42587x).checkCanOpenChat(bundle, o2Var)) {
                            ((ActionBarLayout) launchActivity.O()).P(new qn(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.B0(org.telegram.ui.Components.y4.H(launchActivity, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                return;
            default:
                int[] iArr = (int[]) obj;
                Pattern pattern2 = LaunchActivity.f35493x1;
                LaunchActivity launchActivity2 = this.f42579b;
                org.telegram.ui.ActionBar.b5 O = launchActivity2.O();
                Bundle bundle2 = this.f42580c;
                if (!((ActionBarLayout) O).P(new qn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l12 = this.d;
                    tL_inputChannel.channel_id = l12.longValue();
                    tL_channels_getChannels.f22416id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.K).sendRequest(tL_channels_getChannels, new org.telegram.messenger.h1(launchActivity2, this.f42581e, this.f42582f, l12, this.h, this.f42583n, this.f42584r, this.f42585s, this.v, this.f42586w, this.f42587x, bundle2));
                    return;
                }
                return;
        }
    }

    public s80(LaunchActivity launchActivity, x20 x20Var, TLObject tLObject, boolean z10, Long l10, ve.d dVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, int i9, Bundle bundle) {
        this.f42579b = launchActivity;
        this.f42581e = x20Var;
        this.f42588y = tLObject;
        this.f42582f = z10;
        this.d = l10;
        this.h = dVar;
        this.f42583n = l11;
        this.f42584r = num;
        this.f42585s = num2;
        this.v = bArr;
        this.f42586w = o2Var;
        this.f42587x = i9;
        this.f42580c = bundle;
    }
}

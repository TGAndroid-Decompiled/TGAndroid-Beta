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
public final class s90 implements Runnable {
    public final int f39725a = 1;
    public final LaunchActivity f39726b;
    public final Bundle f39727c;
    public final Long d;
    public final d20 e;
    public final boolean f39728f;
    public final pf.c h;
    public final Long f39729n;
    public final Integer f39730r;
    public final Integer f39731s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.m2 f39732w;
    public final int f39733x;
    public final Object f39734y;

    public s90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, d20 d20Var, boolean z10, pf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f39726b = launchActivity;
        this.f39727c = bundle;
        this.d = l4;
        this.f39734y = iArr;
        this.e = d20Var;
        this.f39728f = z10;
        this.h = cVar;
        this.f39729n = l10;
        this.f39730r = num;
        this.f39731s = num2;
        this.v = bArr;
        this.f39732w = m2Var;
        this.f39733x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f39725a;
        Object obj = this.f39734y;
        switch (i10) {
            case 0:
                d20 d20Var = this.e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    d20Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f39726b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f39728f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f39729n;
                            Integer num = this.f39731s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.k0(-l4.longValue(), this.f39730r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.m2 m2Var = this.f39732w;
                        Bundle bundle = this.f39727c;
                        if (m2Var == null || MessagesController.getInstance(this.f39733x).checkCanOpenChat(bundle, m2Var)) {
                            ((ActionBarLayout) launchActivity.O()).P(new fo(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.B0(org.telegram.ui.Components.g5.G(launchActivity, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                return;
            default:
                int[] iArr = (int[]) obj;
                Pattern pattern2 = LaunchActivity.B1;
                LaunchActivity launchActivity2 = this.f39726b;
                org.telegram.ui.ActionBar.b5 O = launchActivity2.O();
                Bundle bundle2 = this.f39727c;
                if (!((ActionBarLayout) O).P(new fo(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f18952id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.k1(launchActivity2, this.e, this.f39728f, l11, this.h, this.f39729n, this.f39730r, this.f39731s, this.v, this.f39732w, this.f39733x, bundle2));
                    return;
                }
                return;
        }
    }

    public s90(LaunchActivity launchActivity, d20 d20Var, TLObject tLObject, boolean z10, Long l4, pf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, int i10, Bundle bundle) {
        this.f39726b = launchActivity;
        this.e = d20Var;
        this.f39734y = tLObject;
        this.f39728f = z10;
        this.d = l4;
        this.h = cVar;
        this.f39729n = l10;
        this.f39730r = num;
        this.f39731s = num2;
        this.v = bArr;
        this.f39732w = m2Var;
        this.f39733x = i10;
        this.f39727c = bundle;
    }
}

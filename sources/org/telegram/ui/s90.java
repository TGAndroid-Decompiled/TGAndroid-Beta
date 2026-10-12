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
    public final int f40001a = 1;
    public final LaunchActivity f40002b;
    public final Bundle f40003c;
    public final Long d;
    public final o00 e;
    public final boolean f40004f;
    public final pf.c h;
    public final Long f40005n;
    public final Integer f40006r;
    public final Integer f40007s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.m2 f40008w;
    public final int f40009x;
    public final Object f40010y;

    public s90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, o00 o00Var, boolean z10, pf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f40002b = launchActivity;
        this.f40003c = bundle;
        this.d = l4;
        this.f40010y = iArr;
        this.e = o00Var;
        this.f40004f = z10;
        this.h = cVar;
        this.f40005n = l10;
        this.f40006r = num;
        this.f40007s = num2;
        this.v = bArr;
        this.f40008w = m2Var;
        this.f40009x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f40001a;
        Object obj = this.f40010y;
        switch (i10) {
            case 0:
                o00 o00Var = this.e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    o00Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f40002b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f40004f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f40005n;
                            Integer num = this.f40007s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.k0(-l4.longValue(), this.f40006r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.m2 m2Var = this.f40008w;
                        Bundle bundle = this.f40003c;
                        if (m2Var == null || MessagesController.getInstance(this.f40009x).checkCanOpenChat(bundle, m2Var)) {
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
                LaunchActivity launchActivity2 = this.f40002b;
                org.telegram.ui.ActionBar.b5 O = launchActivity2.O();
                Bundle bundle2 = this.f40003c;
                if (!((ActionBarLayout) O).P(new fo(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f19252id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.k1(launchActivity2, this.e, this.f40004f, l11, this.h, this.f40005n, this.f40006r, this.f40007s, this.v, this.f40008w, this.f40009x, bundle2));
                    return;
                }
                return;
        }
    }

    public s90(LaunchActivity launchActivity, o00 o00Var, TLObject tLObject, boolean z10, Long l4, pf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, int i10, Bundle bundle) {
        this.f40002b = launchActivity;
        this.e = o00Var;
        this.f40010y = tLObject;
        this.f40004f = z10;
        this.d = l4;
        this.h = cVar;
        this.f40005n = l10;
        this.f40006r = num;
        this.f40007s = num2;
        this.v = bArr;
        this.f40008w = m2Var;
        this.f40009x = i10;
        this.f40003c = bundle;
    }
}

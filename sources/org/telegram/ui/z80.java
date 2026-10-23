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
public final class z80 implements Runnable {
    public final int f43664a = 1;
    public final LaunchActivity f43665b;
    public final Bundle f43666c;
    public final Long d;
    public final z70 e;
    public final boolean f43667f;
    public final pf.c h;
    public final Long f43668n;
    public final Integer f43669r;
    public final Integer f43670s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.n2 f43671w;
    public final int f43672x;
    public final Object f43673y;

    public z80(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, z70 z70Var, boolean z10, pf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f43665b = launchActivity;
        this.f43666c = bundle;
        this.d = l4;
        this.f43673y = iArr;
        this.e = z70Var;
        this.f43667f = z10;
        this.h = cVar;
        this.f43668n = l10;
        this.f43669r = num;
        this.f43670s = num2;
        this.v = bArr;
        this.f43671w = n2Var;
        this.f43672x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f43664a;
        Object obj = this.f43673y;
        switch (i10) {
            case 0:
                z70 z70Var = this.e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.C1;
                try {
                    z70Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f43665b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f43667f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.w0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f43668n;
                            Integer num = this.f43670s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.l0(-l4.longValue(), this.f43669r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.l0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.n2 n2Var = this.f43671w;
                        Bundle bundle = this.f43666c;
                        if (n2Var == null || MessagesController.getInstance(this.f43672x).checkCanOpenChat(bundle, n2Var)) {
                            ((ActionBarLayout) launchActivity.O()).P(new qn(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.F0(org.telegram.ui.Components.f5.G(launchActivity, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                return;
            default:
                int[] iArr = (int[]) obj;
                Pattern pattern2 = LaunchActivity.C1;
                LaunchActivity launchActivity2 = this.f43665b;
                org.telegram.ui.ActionBar.d5 O = launchActivity2.O();
                Bundle bundle2 = this.f43666c;
                if (!((ActionBarLayout) O).P(new qn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f20316id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.l1(launchActivity2, this.e, this.f43667f, l11, this.h, this.f43668n, this.f43669r, this.f43670s, this.v, this.f43671w, this.f43672x, bundle2));
                    return;
                }
                return;
        }
    }

    public z80(LaunchActivity launchActivity, z70 z70Var, TLObject tLObject, boolean z10, Long l4, pf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.f43665b = launchActivity;
        this.e = z70Var;
        this.f43673y = tLObject;
        this.f43667f = z10;
        this.d = l4;
        this.h = cVar;
        this.f43668n = l10;
        this.f43669r = num;
        this.f43670s = num2;
        this.v = bArr;
        this.f43671w = n2Var;
        this.f43672x = i10;
        this.f43666c = bundle;
    }
}

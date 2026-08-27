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

public final class x80 implements Runnable {

    public final int f44315a = 1;

    public final LaunchActivity f44316b;

    public final Bundle f44317c;
    public final Long d;

    public final a30 f44318e;

    public final boolean f44319f;
    public final we.d h;

    public final Long f44320n;

    public final Integer f44321r;

    public final Integer f44322s;
    public final byte[] v;

    public final org.telegram.ui.ActionBar.n2 f44323w;

    public final int f44324x;

    public final Object f44325y;

    public x80(LaunchActivity launchActivity, Bundle bundle, Long l10, int[] iArr, a30 a30Var, boolean z10, we.d dVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f44316b = launchActivity;
        this.f44317c = bundle;
        this.d = l10;
        this.f44325y = iArr;
        this.f44318e = a30Var;
        this.f44319f = z10;
        this.h = dVar;
        this.f44320n = l11;
        this.f44321r = num;
        this.f44322s = num2;
        this.v = bArr;
        this.f44323w = n2Var;
        this.f44324x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f44315a;
        Object obj = this.f44325y;
        switch (i10) {
            case 0:
                a30 a30Var = this.f44318e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.f35496x1;
                try {
                    a30Var.run();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f44316b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.K).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l10 = this.d;
                        if (chat != null && this.f44319f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l10.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l11 = this.f44320n;
                            Integer num = this.f44322s;
                            byte[] bArr = this.v;
                            if (l11 != null) {
                                launchActivity.k0(-l10.longValue(), this.f44321r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l10.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.n2 n2Var = this.f44323w;
                        Bundle bundle = this.f44317c;
                        if (n2Var == null || MessagesController.getInstance(this.f44324x).checkCanOpenChat(bundle, n2Var)) {
                            ((ActionBarLayout) launchActivity.O()).P(new rn(bundle));
                        }
                    }
                }
                launchActivity.B0(org.telegram.ui.Components.y4.H(launchActivity, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                break;
            default:
                int[] iArr = (int[]) obj;
                Pattern pattern2 = LaunchActivity.f35496x1;
                LaunchActivity launchActivity2 = this.f44316b;
                org.telegram.ui.ActionBar.b5 b5VarO = launchActivity2.O();
                Bundle bundle2 = this.f44317c;
                if (!((ActionBarLayout) b5VarO).P(new rn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l12 = this.d;
                    tL_inputChannel.channel_id = l12.longValue();
                    tL_channels_getChannels.f22416id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.K).sendRequest(tL_channels_getChannels, new org.telegram.messenger.g1(launchActivity2, this.f44318e, this.f44319f, l12, this.h, this.f44320n, this.f44321r, this.f44322s, this.v, this.f44323w, this.f44324x, bundle2));
                }
                break;
        }
    }

    public x80(LaunchActivity launchActivity, a30 a30Var, TLObject tLObject, boolean z10, Long l10, we.d dVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.f44316b = launchActivity;
        this.f44318e = a30Var;
        this.f44325y = tLObject;
        this.f44319f = z10;
        this.d = l10;
        this.h = dVar;
        this.f44320n = l11;
        this.f44321r = num;
        this.f44322s = num2;
        this.v = bArr;
        this.f44323w = n2Var;
        this.f44324x = i10;
        this.f44317c = bundle;
    }
}

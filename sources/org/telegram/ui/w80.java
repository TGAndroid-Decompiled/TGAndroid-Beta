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
public final class w80 implements Runnable {
    public final int f43867a = 1;
    public final LaunchActivity f43868b;
    public final Bundle f43869c;
    public final Long d;
    public final x60 f43870e;
    public final boolean f43871f;
    public final ye.c h;
    public final Long f43872n;
    public final Integer f43873r;
    public final Integer f43874s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.o2 f43875w;
    public final int f43876x;
    public final Object f43877y;

    public w80(LaunchActivity launchActivity, Bundle bundle, Long l10, int[] iArr, x60 x60Var, boolean z10, ye.c cVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        this.f43868b = launchActivity;
        this.f43869c = bundle;
        this.d = l10;
        this.f43877y = iArr;
        this.f43870e = x60Var;
        this.f43871f = z10;
        this.h = cVar;
        this.f43872n = l11;
        this.f43873r = num;
        this.f43874s = num2;
        this.v = bArr;
        this.f43875w = o2Var;
        this.f43876x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f43867a;
        Object obj = this.f43877y;
        switch (i10) {
            case 0:
                x60 x60Var = this.f43870e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.f35560x1;
                try {
                    x60Var.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f43868b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.K).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l10 = this.d;
                        if (chat != null && this.f43871f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l10.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l11 = this.f43872n;
                            Integer num = this.f43874s;
                            byte[] bArr = this.v;
                            if (l11 != null) {
                                launchActivity.k0(-l10.longValue(), this.f43873r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l10.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.o2 o2Var = this.f43875w;
                        Bundle bundle = this.f43869c;
                        if (o2Var == null || MessagesController.getInstance(this.f43876x).checkCanOpenChat(bundle, o2Var)) {
                            ((ActionBarLayout) launchActivity.O()).P(new tn(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.B0(org.telegram.ui.Components.c5.H(launchActivity, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                return;
            default:
                int[] iArr = (int[]) obj;
                Pattern pattern2 = LaunchActivity.f35560x1;
                LaunchActivity launchActivity2 = this.f43868b;
                org.telegram.ui.ActionBar.b5 O = launchActivity2.O();
                Bundle bundle2 = this.f43869c;
                if (!((ActionBarLayout) O).P(new tn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l12 = this.d;
                    tL_inputChannel.channel_id = l12.longValue();
                    tL_channels_getChannels.f22428id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.K).sendRequest(tL_channels_getChannels, new org.telegram.messenger.g1(launchActivity2, this.f43870e, this.f43871f, l12, this.h, this.f43872n, this.f43873r, this.f43874s, this.v, this.f43875w, this.f43876x, bundle2));
                    return;
                }
                return;
        }
    }

    public w80(LaunchActivity launchActivity, x60 x60Var, TLObject tLObject, boolean z10, Long l10, ye.c cVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, int i10, Bundle bundle) {
        this.f43868b = launchActivity;
        this.f43870e = x60Var;
        this.f43877y = tLObject;
        this.f43871f = z10;
        this.d = l10;
        this.h = cVar;
        this.f43872n = l11;
        this.f43873r = num;
        this.f43874s = num2;
        this.v = bArr;
        this.f43875w = o2Var;
        this.f43876x = i10;
        this.f43869c = bundle;
    }
}

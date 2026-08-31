package qh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.x51;
public final class c6 implements Utilities.Callback2 {
    public final int f45058a;
    public final k6 f45059b;

    public c6(k6 k6Var, int i10) {
        this.f45058a = i10;
        this.f45059b = k6Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        boolean z4;
        boolean z10;
        switch (this.f45058a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                x51 x51Var = (x51) obj2;
                k6 k6Var = this.f45059b;
                MessagesController.SavedMusicList savedMusicList = k6Var.f45568b0;
                x51Var.B = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(j51.C(AndroidUtilities.dp(64.0f)));
                if (k6Var.W || k6Var.f45571e0) {
                    dp += k6Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), k6Var.Y, false, false, -1);
                }
                if (!k6Var.W) {
                    if (TextUtils.isEmpty(k6Var.f45581p0) && !k6Var.f45571e0) {
                        x51Var.U();
                        j51 c3 = j51.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c3.f28019q = true;
                        arrayList.add(c3);
                        x51Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!k6Var.f45571e0 && savedMusicList != null) {
                        dp += k6Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    String string = LocaleController.getString(R.string.AudioSearchChats);
                    ArrayList arrayList2 = k6Var.Z;
                    if (!k6Var.f45585t0 && !k6Var.f45584s0) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    int W = dp + k6Var.W(false, arrayList, string, arrayList2, z4, k6Var.f45583r0, 3);
                    String string2 = LocaleController.getString(R.string.AudioSearchGlobal);
                    ArrayList arrayList3 = k6Var.f45567a0;
                    if (!k6Var.A0 && !k6Var.f45591z0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    dp = W + k6Var.W(false, arrayList, string2, arrayList3, z10, k6Var.f45590y0, 4);
                }
                int size = arrayList.size();
                if (!k6Var.W && TextUtils.isEmpty(k6Var.f45581p0) && !k6Var.f45571e0) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                if (size <= i10) {
                    if (TextUtils.isEmpty(k6Var.f45581p0)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i12 = vi.f31911a;
                        j51 J = j51.J(vi.class);
                        J.f28014l = string3;
                        J.f28015m = string4;
                        arrayList.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        if (k6Var.f45581p0.length() >= 3) {
                            i11 = R.string.NoAudioFoundInfo2;
                        } else {
                            i11 = R.string.NoAudioFoundInfo;
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, k6Var.f45581p0));
                        int i13 = vi.f31911a;
                        j51 J2 = j51.J(vi.class);
                        J2.f28014l = string5;
                        J2.f28015m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(j51.B(null));
                arrayList.add(j51.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                k6.P(this.f45059b, (TLRPC.messages_BotResults) obj);
                return;
        }
    }
}

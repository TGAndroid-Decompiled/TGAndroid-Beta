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
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w51;
public final class b6 implements Utilities.Callback2 {
    public final int f45024a;
    public final i6 f45025b;

    public b6(i6 i6Var, int i10) {
        this.f45024a = i10;
        this.f45025b = i6Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        boolean z4;
        boolean z10;
        switch (this.f45024a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                w51 w51Var = (w51) obj2;
                i6 i6Var = this.f45025b;
                MessagesController.SavedMusicList savedMusicList = i6Var.f45467b0;
                w51Var.B = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(h51.C(AndroidUtilities.dp(64.0f)));
                if (i6Var.W || i6Var.f45470e0) {
                    dp += i6Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), i6Var.Y, false, false, -1);
                }
                if (!i6Var.W) {
                    if (TextUtils.isEmpty(i6Var.f45480p0) && !i6Var.f45470e0) {
                        w51Var.U();
                        h51 c3 = h51.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c3.f27380q = true;
                        arrayList.add(c3);
                        w51Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!i6Var.f45470e0 && savedMusicList != null) {
                        dp += i6Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    String string = LocaleController.getString(R.string.AudioSearchChats);
                    ArrayList arrayList2 = i6Var.Z;
                    if (!i6Var.f45484t0 && !i6Var.f45483s0) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    int W = dp + i6Var.W(false, arrayList, string, arrayList2, z4, i6Var.f45482r0, 3);
                    String string2 = LocaleController.getString(R.string.AudioSearchGlobal);
                    ArrayList arrayList3 = i6Var.f45466a0;
                    if (!i6Var.A0 && !i6Var.f45490z0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    dp = W + i6Var.W(false, arrayList, string2, arrayList3, z10, i6Var.f45489y0, 4);
                }
                int size = arrayList.size();
                if (!i6Var.W && TextUtils.isEmpty(i6Var.f45480p0) && !i6Var.f45470e0) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                if (size <= i10) {
                    if (TextUtils.isEmpty(i6Var.f45480p0)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i12 = vi.f31889a;
                        h51 J = h51.J(vi.class);
                        J.f27375l = string3;
                        J.f27376m = string4;
                        arrayList.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        if (i6Var.f45480p0.length() >= 3) {
                            i11 = R.string.NoAudioFoundInfo2;
                        } else {
                            i11 = R.string.NoAudioFoundInfo;
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, i6Var.f45480p0));
                        int i13 = vi.f31889a;
                        h51 J2 = h51.J(vi.class);
                        J2.f27375l = string5;
                        J2.f27376m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(h51.B(null));
                arrayList.add(h51.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                i6.P(this.f45025b, (TLRPC.messages_BotResults) obj);
                return;
        }
    }
}

package ph;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.w51;
public final class d6 implements Utilities.Callback2 {
    public final int f41494a;
    public final l6 f41495b;

    public d6(l6 l6Var, int i10) {
        this.f41494a = i10;
        this.f41495b = l6Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        boolean z4;
        boolean z10;
        switch (this.f41494a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                w51 w51Var = (w51) obj2;
                l6 l6Var = this.f41495b;
                MessagesController.SavedMusicList savedMusicList = l6Var.f41947b0;
                w51Var.B = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(i51.C(AndroidUtilities.dp(64.0f)));
                if (l6Var.W || l6Var.f41950e0) {
                    dp += l6Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), l6Var.Y, false, false, -1);
                }
                if (!l6Var.W) {
                    if (TextUtils.isEmpty(l6Var.f41960p0) && !l6Var.f41950e0) {
                        w51Var.U();
                        i51 c3 = i51.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c3.f25590q = true;
                        arrayList.add(c3);
                        w51Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!l6Var.f41950e0 && savedMusicList != null) {
                        dp += l6Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    String string = LocaleController.getString(R.string.AudioSearchChats);
                    ArrayList arrayList2 = l6Var.Z;
                    if (!l6Var.f41964t0 && !l6Var.f41963s0) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    int W = dp + l6Var.W(false, arrayList, string, arrayList2, z4, l6Var.f41962r0, 3);
                    String string2 = LocaleController.getString(R.string.AudioSearchGlobal);
                    ArrayList arrayList3 = l6Var.f41946a0;
                    if (!l6Var.A0 && !l6Var.f41970z0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    dp = W + l6Var.W(false, arrayList, string2, arrayList3, z10, l6Var.f41969y0, 4);
                }
                int size = arrayList.size();
                if (!l6Var.W && TextUtils.isEmpty(l6Var.f41960p0) && !l6Var.f41950e0) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                if (size <= i10) {
                    if (TextUtils.isEmpty(l6Var.f41960p0)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i12 = ui.f29215a;
                        i51 J = i51.J(ui.class);
                        J.f25585l = string3;
                        J.f25586m = string4;
                        arrayList.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        if (l6Var.f41960p0.length() >= 3) {
                            i11 = R.string.NoAudioFoundInfo2;
                        } else {
                            i11 = R.string.NoAudioFoundInfo;
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, l6Var.f41960p0));
                        int i13 = ui.f29215a;
                        i51 J2 = i51.J(ui.class);
                        J2.f25585l = string5;
                        J2.f25586m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(i51.B(null));
                arrayList.add(i51.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                l6.P(this.f41495b, (TLRPC.messages_BotResults) obj);
                return;
        }
    }
}

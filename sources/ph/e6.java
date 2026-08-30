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
public final class e6 implements Utilities.Callback2 {
    public final int f41576a;
    public final m6 f41577b;

    public e6(m6 m6Var, int i10) {
        this.f41576a = i10;
        this.f41577b = m6Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        boolean z4;
        boolean z10;
        switch (this.f41576a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                w51 w51Var = (w51) obj2;
                m6 m6Var = this.f41577b;
                MessagesController.SavedMusicList savedMusicList = m6Var.f41940b0;
                w51Var.B = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(i51.C(AndroidUtilities.dp(64.0f)));
                if (m6Var.W || m6Var.f41943e0) {
                    dp += m6Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), m6Var.Y, false, false, -1);
                }
                if (!m6Var.W) {
                    if (TextUtils.isEmpty(m6Var.f41953p0) && !m6Var.f41943e0) {
                        w51Var.U();
                        i51 c3 = i51.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c3.f25570q = true;
                        arrayList.add(c3);
                        w51Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!m6Var.f41943e0 && savedMusicList != null) {
                        dp += m6Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    String string = LocaleController.getString(R.string.AudioSearchChats);
                    ArrayList arrayList2 = m6Var.Z;
                    if (!m6Var.f41957t0 && !m6Var.f41956s0) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    int W = dp + m6Var.W(false, arrayList, string, arrayList2, z4, m6Var.f41955r0, 3);
                    String string2 = LocaleController.getString(R.string.AudioSearchGlobal);
                    ArrayList arrayList3 = m6Var.f41939a0;
                    if (!m6Var.A0 && !m6Var.f41963z0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    dp = W + m6Var.W(false, arrayList, string2, arrayList3, z10, m6Var.f41962y0, 4);
                }
                int size = arrayList.size();
                if (!m6Var.W && TextUtils.isEmpty(m6Var.f41953p0) && !m6Var.f41943e0) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                if (size <= i10) {
                    if (TextUtils.isEmpty(m6Var.f41953p0)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i12 = ui.f29225a;
                        i51 J = i51.J(ui.class);
                        J.f25565l = string3;
                        J.f25566m = string4;
                        arrayList.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        if (m6Var.f41953p0.length() >= 3) {
                            i11 = R.string.NoAudioFoundInfo2;
                        } else {
                            i11 = R.string.NoAudioFoundInfo;
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, m6Var.f41953p0));
                        int i13 = ui.f29225a;
                        i51 J2 = i51.J(ui.class);
                        J2.f25565l = string5;
                        J2.f25566m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(i51.B(null));
                arrayList.add(i51.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                m6.P(this.f41577b, (TLRPC.messages_BotResults) obj);
                return;
        }
    }
}

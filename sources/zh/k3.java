package zh;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wc;
public final class k3 implements ll0 {
    public final u7 f48585a;
    public final z3 f48586b;

    public k3(z3 z3Var, u7 u7Var) {
        this.f48586b = z3Var;
        this.f48585a = u7Var;
    }

    @Override
    public final boolean d(int i10, View view) {
        final TL_stories.StoryView storyView;
        final MessagesController messagesController;
        final TLRPC.User user;
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        TLRPC.InputStickerSet c10;
        z3 z3Var = this.f48586b;
        b bVar = z3Var.f49143s;
        int i11 = z3Var.v;
        if (view instanceof org.telegram.ui.Cells.p6) {
            final org.telegram.ui.Cells.p6 p6Var = (org.telegram.ui.Cells.p6) view;
            u7 u7Var = this.f48585a;
            if (u7Var.v != null && (storyView = ((r3) z3Var.f49144w.f48987c.get(i10)).f48828b) != null && (user = (messagesController = MessagesController.getInstance(i11)).getUser(Long.valueOf(storyView.user_id))) != null) {
                if (messagesController.blockePeers.indexOfKey(user.f17342id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!user.contact && ContactsController.getInstance(i11).contactsDict.get(Long.valueOf(user.f17342id)) == null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                boolean d = z3Var.d(storyView);
                boolean L = messagesController.getStoriesController().L(storyView);
                boolean isUserSelf = UserObject.isUserSelf(user);
                if (TextUtils.isEmpty(user.first_name)) {
                    if (TextUtils.isEmpty(user.last_name)) {
                        str = "";
                    } else {
                        str = user.last_name;
                    }
                } else {
                    str = user.first_name;
                }
                int indexOf = str.indexOf(" ");
                if (indexOf > 2) {
                    str = str.substring(0, indexOf);
                }
                if (isUserSelf) {
                    return false;
                }
                w70 F = w70.F(u7Var.v, bVar, view);
                F.f28683i = 3;
                F.f28685j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, bVar)));
                F.f28701s = 133;
                if (d && !L && !z10 && !isUserSelf) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                final String str2 = str;
                F.l(R.drawable.msg_stories_myhide, LocaleController.formatString(R.string.StoryHideFrom, str), new Runnable(this) {
                    public final k3 f48493b;

                    {
                        this.f48493b = this;
                    }

                    @Override
                    public final void run() {
                        int i12 = r7;
                        float f7 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.p6 p6Var2 = p6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        k3 k3Var = this.f48493b;
                        switch (i12) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.f17342id, true, true);
                                z3 z3Var2 = k3Var.f48586b;
                                com.google.android.gms.internal.vision.e2.o(R.string.StoryHidFromToast, new Object[]{str3}, new wc(z3Var2, z3Var2.f49143s), R.raw.ic_ban, 36);
                                if (z3Var2.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                p6Var2.a(f7, true);
                                return;
                            default:
                                messagesController2.getStoriesController().j0(user2.f17342id, false, true);
                                z3 z3Var3 = k3Var.f48586b;
                                com.google.android.gms.internal.vision.e2.o(R.string.StoryShownBackToToast, new Object[]{str3}, new wc(z3Var3, z3Var3.f49143s), R.raw.contact_check, 36);
                                if (z3Var3.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                p6Var2.a(f7, true);
                                return;
                        }
                    }
                }, z12);
                F.E();
                F.t();
                if (L && !z10 && !isUserSelf) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                F.l(R.drawable.msg_menu_stories, LocaleController.formatString(R.string.StoryShowBackTo, str2), new Runnable(this) {
                    public final k3 f48493b;

                    {
                        this.f48493b = this;
                    }

                    @Override
                    public final void run() {
                        int i12 = r7;
                        float f7 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.p6 p6Var2 = p6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        k3 k3Var = this.f48493b;
                        switch (i12) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.f17342id, true, true);
                                z3 z3Var2 = k3Var.f48586b;
                                com.google.android.gms.internal.vision.e2.o(R.string.StoryHidFromToast, new Object[]{str3}, new wc(z3Var2, z3Var2.f49143s), R.raw.ic_ban, 36);
                                if (z3Var2.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                p6Var2.a(f7, true);
                                return;
                            default:
                                messagesController2.getStoriesController().j0(user2.f17342id, false, true);
                                z3 z3Var3 = k3Var.f48586b;
                                com.google.android.gms.internal.vision.e2.o(R.string.StoryShownBackToToast, new Object[]{str3}, new wc(z3Var3, z3Var3.f49143s), R.raw.contact_check, 36);
                                if (z3Var3.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                p6Var2.a(f7, true);
                                return;
                        }
                    }
                }, z13);
                F.E();
                F.t();
                if (!z11 && !z10 && !isUserSelf) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                F.m(z14, R.drawable.msg_user_remove, LocaleController.getString(R.string.BlockUser), true, new Runnable(this) {
                    public final k3 f48535b;

                    {
                        this.f48535b = this;
                    }

                    @Override
                    public final void run() {
                        float f7;
                        float f10;
                        switch (r6) {
                            case 0:
                                messagesController.blockPeer(user.f17342id);
                                z3 z3Var2 = this.f48535b.f48586b;
                                new wc(z3Var2, z3Var2.f49143s).e(true).j();
                                if (z3Var2.d(storyView)) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.5f;
                                }
                                p6Var.a(f7, true);
                                return;
                            default:
                                MessagesController messagesController2 = messagesController;
                                i5 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.f17342id, false, true);
                                messagesController2.unblockPeer(user2.f17342id);
                                z3 z3Var3 = this.f48535b.f48586b;
                                new wc(z3Var3, z3Var3.f49143s).e(false).j();
                                if (z3Var3.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                p6Var.a(f10, true);
                                return;
                        }
                    }
                });
                if (!z11 && z10 && !isUserSelf) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                F.l(R.drawable.msg_block, LocaleController.getString(R.string.Unblock), new Runnable(this) {
                    public final k3 f48535b;

                    {
                        this.f48535b = this;
                    }

                    @Override
                    public final void run() {
                        float f7;
                        float f10;
                        switch (r6) {
                            case 0:
                                messagesController.blockPeer(user.f17342id);
                                z3 z3Var2 = this.f48535b.f48586b;
                                new wc(z3Var2, z3Var2.f49143s).e(true).j();
                                if (z3Var2.d(storyView)) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.5f;
                                }
                                p6Var.a(f7, true);
                                return;
                            default:
                                MessagesController messagesController2 = messagesController;
                                i5 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.f17342id, false, true);
                                messagesController2.unblockPeer(user2.f17342id);
                                z3 z3Var3 = this.f48535b.f48586b;
                                new wc(z3Var3, z3Var3.f49143s).e(false).j();
                                if (z3Var3.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                p6Var.a(f10, true);
                                return;
                        }
                    }
                }, z15);
                if (z11 && !isUserSelf) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                F.m(z16, R.drawable.msg_user_remove, LocaleController.getString(R.string.StoryDeleteContact), true, new xh.x4(this, user, str2, p6Var, storyView, 7));
                TLRPC.Reaction reaction = storyView.reaction;
                if ((reaction instanceof TLRPC.TL_reactionCustomEmoji) && (c10 = org.telegram.ui.Components.p5.h(i11).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) != null) {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c10);
                    db0 db0Var = new db0(z3Var.v, z3Var.getContext(), bVar, arrayList, 3);
                    db0Var.setOnClickListener(new wh.r(this, arrayList, F, 8));
                    F.q(db0Var);
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (F.x() <= 0 && !z17) {
                    return false;
                }
                F.Z();
                try {
                    z3Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}

package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y60 extends org.telegram.ui.Components.bl0 {
    public int B;
    public int C;
    public int D;
    public int E;
    public final a70 F;
    public final Context f40157c;
    public final tf.j1 f40158f;
    public Runnable h;
    public boolean f40159n;
    public int f40161s;
    public int v;
    public int f40162w;
    public int f40163x;
    public int f40164y;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList f40160r = new ArrayList();

    public y60(a70 a70Var, Context context) {
        TLRPC.Chat chat;
        String substring;
        String substring2;
        TLRPC.User user;
        this.F = a70Var;
        this.f40157c = context;
        HashSet hashSet = new HashSet();
        ContactsController contactsController = a70Var.getContactsController();
        boolean z4 = a70Var.N;
        ArrayList<TLRPC.TL_contact> arrayList = contactsController.contacts;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User user2 = a70Var.getMessagesController().getUser(Long.valueOf(arrayList.get(i10).user_id));
            if (user2 != null && !user2.self && !user2.deleted) {
                this.f40160r.add(user2);
                hashSet.add(Long.valueOf(user2.f19306id));
            }
        }
        if (a70Var.M || a70Var.L || z4) {
            ArrayList<TLRPC.Dialog> allDialogs = a70Var.getMessagesController().getAllDialogs();
            if (z4) {
                int size = allDialogs.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.Dialog dialog = allDialogs.get(i11);
                    if (DialogObject.isUserDialog(dialog.f19163id) && !hashSet.contains(Long.valueOf(dialog.f19163id)) && (user = a70Var.getMessagesController().getUser(Long.valueOf(dialog.f19163id))) != null && !UserObject.isDeleted(user) && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isService(dialog.f19163id) && !MessagesController.isSupportUser(user)) {
                        this.f40160r.add(user);
                        hashSet.add(Long.valueOf(user.f19306id));
                    }
                }
            } else {
                int size2 = allDialogs.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    TLRPC.Dialog dialog2 = allDialogs.get(i12);
                    if (DialogObject.isChatDialog(dialog2.f19163id) && (chat = a70Var.getMessagesController().getChat(Long.valueOf(-dialog2.f19163id))) != null && chat.migrated_to == null && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                        this.f40160r.add(chat);
                    }
                }
            }
            Collections.sort(this.f40160r, new Object());
            TLObject tLObject = null;
            int i13 = 0;
            while (i13 < this.f40160r.size()) {
                TLObject tLObject2 = (TLObject) this.f40160r.get(i13);
                if (tLObject != null) {
                    String a2 = u60.a(tLObject);
                    if (TextUtils.isEmpty(a2)) {
                        substring = "";
                    } else {
                        substring = a2.substring(0, 1);
                    }
                    String a10 = u60.a(tLObject2);
                    if (TextUtils.isEmpty(a10)) {
                        substring2 = "";
                    } else {
                        substring2 = a10.substring(0, 1);
                    }
                    if (substring.equals(substring2)) {
                        i13++;
                        tLObject = tLObject2;
                    }
                }
                ArrayList arrayList2 = this.f40160r;
                String a11 = u60.a(tLObject2);
                arrayList2.add(i13, new z60(TextUtils.isEmpty(a11) ? "" : a11.substring(0, 1)));
                i13++;
                tLObject = tLObject2;
            }
        }
        tf.j1 j1Var = new tf.j1(false);
        this.f40158f = j1Var;
        j1Var.f44819a = new hu(this, 11);
    }

    @Override
    public final void A(f2.l1 l1Var) {
        View view = l1Var.f5774a;
        if (view instanceof org.telegram.ui.Cells.f4) {
            ((org.telegram.ui.Cells.f4) view).f21019a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f != 0) {
            a70 a70Var = this.F;
            if (a70Var.G != null) {
                View view = l1Var.f5774a;
                if (view instanceof org.telegram.ui.Cells.f4) {
                    Object object = ((org.telegram.ui.Cells.f4) view).getObject();
                    if ((object instanceof TLRPC.User) && a70Var.G.h(((TLRPC.User) object).f19306id) >= 0) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        String str;
        String str2;
        if (!this.f40159n && i10 >= this.B) {
            ArrayList arrayList = this.f40160r;
            int size = arrayList.size();
            int i11 = this.B;
            if (i10 < size + i11) {
                TLObject tLObject = (TLObject) arrayList.get(i10 - i11);
                if (tLObject instanceof z60) {
                    return ((z60) tLObject).f40411a;
                }
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    str = user.first_name;
                    str2 = user.last_name;
                } else {
                    str = ((TLRPC.Chat) tLObject).title;
                    str2 = "";
                }
                if (LocaleController.nameDisplayOrder == 1) {
                    if (!TextUtils.isEmpty(str)) {
                        return str.substring(0, 1).toUpperCase();
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        return str2.substring(0, 1).toUpperCase();
                    }
                } else if (!TextUtils.isEmpty(str2)) {
                    return str2.substring(0, 1).toUpperCase();
                } else {
                    if (!TextUtils.isEmpty(str)) {
                        return str.substring(0, 1).toUpperCase();
                    }
                }
                return "";
            }
            return null;
        }
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.rl0 rl0Var, float f10, int[] iArr) {
        iArr[0] = (int) (h() * f10);
        iArr[1] = 0;
    }

    public final void L(String str) {
        boolean z4;
        if (this.h != null) {
            Utilities.searchQueue.cancelRunnable(this.h);
            this.h = null;
        }
        this.d.clear();
        this.e.clear();
        this.f40158f.f(null, null);
        tf.j1 j1Var = this.f40158f;
        a70 a70Var = this.F;
        if (!a70Var.L && !a70Var.M) {
            z4 = false;
        } else {
            z4 = true;
        }
        j1Var.g(null, true, z4, false, false, 0L, false, 0, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            x60 x60Var = new x60(this, str, 0);
            this.h = x60Var;
            dispatchQueue.postRunnable(x60Var, 300L);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        a70 a70Var = this.F;
        long j10 = a70Var.E;
        long j11 = a70Var.D;
        this.D = -1;
        this.f40161s = -1;
        this.f40162w = -1;
        this.v = -1;
        this.f40163x = -1;
        this.f40164y = -1;
        if (this.f40159n) {
            int size = this.d.size();
            tf.j1 j1Var = this.f40158f;
            int size2 = j1Var.d.size();
            int size3 = j1Var.e.size();
            int i12 = size + size2;
            if (size3 != 0) {
                i12 += size3 + 1;
            }
            this.E = i12;
            return i12;
        }
        if (a70Var.N) {
            this.f40162w = 0;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (a70Var.S) {
            int i13 = i10 + 1;
            this.v = i10;
            this.f40161s = i10;
            i10 += 2;
            this.f40163x = i13;
        } else if (a70Var.T) {
            int i14 = i10 + 1;
            this.v = i10;
            this.f40161s = i10;
            i10 += 2;
            this.f40164y = i14;
        } else {
            this.v = i10;
        }
        this.B = i10;
        int size4 = this.f40160r.size() + i10;
        if (a70Var.O) {
            if (j11 != 0) {
                this.C = ChatObject.canUserDoAdminAction(a70Var.getMessagesController().getChat(Long.valueOf(j11)), 3) ? 1 : 0;
            } else if (j10 != 0) {
                TLRPC.Chat chat = a70Var.getMessagesController().getChat(Long.valueOf(j10));
                if (ChatObject.canUserDoAdminAction(chat, 3) && !ChatObject.isPublic(chat)) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
                this.C = i11;
            } else {
                this.C = 0;
            }
            if (this.C != 0) {
                this.B++;
                size4++;
            }
        }
        if (size4 == 0) {
            this.D = 0;
            size4++;
        }
        this.E = size4;
        return size4;
    }

    @Override
    public final int j(int i10) {
        if (this.f40159n) {
            if (i10 == this.f40158f.d.size() + this.d.size()) {
                return 0;
            }
            return 1;
        } else if (i10 != this.f40162w) {
            if (i10 != this.f40161s) {
                if (i10 != this.f40163x && i10 != this.f40164y) {
                    if (this.C != 0 && i10 == 0) {
                        return 2;
                    }
                    if (this.D == i10) {
                        return 3;
                    }
                    int i11 = i10 - this.B;
                    if (i11 >= 0) {
                        ArrayList arrayList = this.f40160r;
                        if (i11 < arrayList.size() && (arrayList.get(i10 - this.B) instanceof z60)) {
                            return 0;
                        }
                        return 1;
                    }
                    return 1;
                }
                return 1;
            }
            return 0;
        } else {
            return 2;
        }
    }

    @Override
    public final void l() {
        super.l();
        this.F.r0();
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        String string;
        TLObject tLObject;
        SpannableStringBuilder spannableStringBuilder;
        long j10;
        boolean z4;
        CharSequence charSequence;
        String publicUsername;
        int i11 = l1Var.f5777f;
        View view = l1Var.f5774a;
        ArrayList arrayList = this.f40160r;
        a70 a70Var = this.F;
        if (i11 != 0) {
            boolean z10 = true;
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                    if (i10 == this.f40162w) {
                        n8Var.m(R.drawable.menu_link_create2, LocaleController.getString(R.string.GroupCallCreateLink), false);
                        n8Var.e(org.telegram.ui.ActionBar.j6.f20200v6, org.telegram.ui.ActionBar.j6.f20182u6);
                        return;
                    } else if (this.C == 2) {
                        n8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                        n8Var.e(org.telegram.ui.ActionBar.j6.f20042m6, org.telegram.ui.ActionBar.j6.G6);
                        return;
                    } else {
                        n8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                        n8Var.e(org.telegram.ui.ActionBar.j6.f20042m6, org.telegram.ui.ActionBar.j6.G6);
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            SpannableStringBuilder spannableStringBuilder2 = null;
            if (this.f40159n) {
                int size = this.d.size();
                tf.j1 j1Var = this.f40158f;
                ArrayList arrayList2 = j1Var.e;
                ArrayList arrayList3 = j1Var.d;
                int size2 = arrayList2.size();
                int size3 = arrayList3.size();
                if (i10 >= 0 && i10 < size) {
                    tLObject = (TLObject) this.d.get(i10);
                } else if (i10 >= size && i10 < size3 + size) {
                    tLObject = (TLObject) arrayList3.get(i10 - size);
                } else if (i10 > size + size3 && i10 <= size2 + size + size3) {
                    tLObject = (TLObject) j1Var.e.get(((i10 - size) - size3) - 1);
                } else {
                    tLObject = null;
                }
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.User) {
                        publicUsername = ((TLRPC.User) tLObject).username;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) tLObject);
                    } else {
                        return;
                    }
                    if (i10 < size) {
                        charSequence = (CharSequence) this.e.get(i10);
                        if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
                            if (charSequence.toString().startsWith("@" + publicUsername)) {
                                spannableStringBuilder2 = charSequence;
                                charSequence = null;
                            }
                        }
                    } else if (i10 > size && !TextUtils.isEmpty(publicUsername)) {
                        String str = j1Var.f44821c;
                        if (str.startsWith("@")) {
                            str = str.substring(1);
                        }
                        try {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                            spannableStringBuilder3.append((CharSequence) "@");
                            spannableStringBuilder3.append((CharSequence) publicUsername);
                            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, str);
                            if (indexOfIgnoreCase != -1) {
                                int length = str.length();
                                if (indexOfIgnoreCase == 0) {
                                    length++;
                                } else {
                                    indexOfIgnoreCase++;
                                }
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20115q6, false)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
                            }
                            charSequence = null;
                            spannableStringBuilder2 = spannableStringBuilder3;
                        } catch (Exception unused) {
                            charSequence = null;
                            spannableStringBuilder2 = publicUsername;
                        }
                    }
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                    spannableStringBuilder2 = charSequence;
                    spannableStringBuilder = spannableStringBuilder4;
                }
                charSequence = null;
                SpannableStringBuilder spannableStringBuilder42 = spannableStringBuilder2;
                spannableStringBuilder2 = charSequence;
                spannableStringBuilder = spannableStringBuilder42;
            } else if (i10 == this.f40163x) {
                f4Var.f21024r = true;
                f4Var.f21022f = "premium";
                f4Var.f21019a.setImageDrawable(org.telegram.ui.Cells.f4.b(f4Var.getContext(), false));
                f4Var.f21020b.l(LocaleController.getString(R.string.PrivacyPremium), false);
                org.telegram.ui.ActionBar.k5 k5Var = f4Var.f21021c;
                int i12 = org.telegram.ui.ActionBar.j6.f20256y6;
                k5Var.setTag(Integer.valueOf(i12));
                if (f4Var.H) {
                    i12 = org.telegram.ui.ActionBar.j6.f20087og;
                }
                k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f4Var.J));
                k5Var.setEmojiColor(k5Var.getTextColor());
                k5Var.l(LocaleController.getString(R.string.PrivacyPremiumText), false);
                if (a70Var.U == null) {
                    z10 = false;
                }
                f4Var.c(z10, false);
                return;
            } else if (i10 == this.f40164y) {
                f4Var.f21025s = true;
                f4Var.f21022f = "miniapps";
                org.telegram.ui.Components.p9 p9Var = f4Var.f21019a;
                f4Var.getContext();
                p9Var.setImageDrawable(org.telegram.ui.Cells.f4.a(false));
                f4Var.f21020b.l(LocaleController.getString(R.string.PrivacyMiniapps), false);
                org.telegram.ui.ActionBar.k5 k5Var2 = f4Var.f21021c;
                int i13 = org.telegram.ui.ActionBar.j6.f20256y6;
                k5Var2.setTag(Integer.valueOf(i13));
                if (f4Var.H) {
                    i13 = org.telegram.ui.ActionBar.j6.f20087og;
                }
                k5Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f4Var.J));
                k5Var2.setEmojiColor(k5Var2.getTextColor());
                k5Var2.l(LocaleController.getString(R.string.PrivacyMiniappsText), false);
                if (a70Var.V == null) {
                    z10 = false;
                }
                f4Var.c(z10, false);
                return;
            } else {
                tLObject = (TLObject) arrayList.get(i10 - this.B);
                spannableStringBuilder = null;
            }
            f4Var.d(tLObject, spannableStringBuilder2, spannableStringBuilder);
            if (tLObject instanceof TLRPC.User) {
                j10 = ((TLRPC.User) tLObject).f19306id;
            } else if (tLObject instanceof TLRPC.Chat) {
                j10 = -((TLRPC.Chat) tLObject).f19159id;
            } else {
                j10 = 0;
            }
            if (j10 != 0) {
                a0.h hVar = a70Var.G;
                if (hVar != null && hVar.h(j10) >= 0) {
                    f4Var.c(true, false);
                    f4Var.setCheckBoxEnabled(false);
                    return;
                }
                if (a70Var.W.h(j10) >= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                f4Var.c(z4, false);
                f4Var.setCheckBoxEnabled(true);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) view;
        if (this.f40159n) {
            t3Var.setText(LocaleController.getString(R.string.GlobalSearch));
        } else if (i10 == this.f40161s) {
            t3Var.setText(LocaleController.getString(R.string.PrivacyUserTypes));
        } else {
            int i14 = i10 - this.B;
            if (i14 >= 0 && i14 < arrayList.size()) {
                TLObject tLObject2 = (TLObject) arrayList.get(i10 - this.B);
                if (tLObject2 instanceof z60) {
                    t3Var.setText(((z60) tLObject2).f40411a.toUpperCase());
                }
            }
        }
        if (i10 == this.v) {
            if (a70Var.U == null && a70Var.W.i()) {
                string = "";
            } else {
                string = LocaleController.getString(R.string.DeselectAll);
            }
            t3Var.b(string, new g60(this, 2));
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View t3Var;
        Context context = this.f40157c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    t3Var = new org.telegram.ui.Cells.n8(context);
                } else {
                    org.telegram.ui.Components.w60 w60Var = new org.telegram.ui.Components.w60(context, null, 0, null, 1);
                    w60Var.setLayoutParams(new f2.w0(-1, -1));
                    w60Var.e.setVisibility(8);
                    w60Var.d.setText(LocaleController.getString(R.string.NoContacts));
                    w60Var.setAnimateLayoutChange(true);
                    t3Var = w60Var;
                }
            } else {
                t3Var = new org.telegram.ui.Cells.f4(context, 1, 0, false);
            }
        } else {
            t3Var = new org.telegram.ui.Cells.t3(context, null);
        }
        return new f2.l1(t3Var);
    }
}

package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r60 extends org.telegram.ui.Components.ul0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public final t60 I;
    public final Context f42861c;
    public final ig.a2 f42862f;
    public Runnable h;
    public boolean f42863n;
    public int f42865s;
    public int v;
    public int f42866w;
    public int f42867x;
    public int f42868y;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList f42864r = new ArrayList();

    public r60(t60 t60Var, Context context) {
        TLRPC.Chat chat;
        String substring;
        String substring2;
        TLRPC.User user;
        this.I = t60Var;
        this.f42861c = context;
        HashSet hashSet = new HashSet();
        ContactsController contactsController = t60Var.getContactsController();
        boolean z10 = t60Var.Q;
        ArrayList<TLRPC.TL_contact> arrayList = contactsController.contacts;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User user2 = t60Var.getMessagesController().getUser(Long.valueOf(arrayList.get(i10).user_id));
            if (user2 != null && !user2.self && !user2.deleted) {
                this.f42864r.add(user2);
                hashSet.add(Long.valueOf(user2.f22177id));
            }
        }
        if (t60Var.P || t60Var.O || z10) {
            ArrayList<TLRPC.Dialog> allDialogs = t60Var.getMessagesController().getAllDialogs();
            if (z10) {
                int size = allDialogs.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.Dialog dialog = allDialogs.get(i11);
                    if (DialogObject.isUserDialog(dialog.f22032id) && !hashSet.contains(Long.valueOf(dialog.f22032id)) && (user = t60Var.getMessagesController().getUser(Long.valueOf(dialog.f22032id))) != null && !UserObject.isDeleted(user) && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isService(dialog.f22032id) && !MessagesController.isSupportUser(user)) {
                        this.f42864r.add(user);
                        hashSet.add(Long.valueOf(user.f22177id));
                    }
                }
            } else {
                int size2 = allDialogs.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    TLRPC.Dialog dialog2 = allDialogs.get(i12);
                    if (DialogObject.isChatDialog(dialog2.f22032id) && (chat = t60Var.getMessagesController().getChat(Long.valueOf(-dialog2.f22032id))) != null && chat.migrated_to == null && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                        this.f42864r.add(chat);
                    }
                }
            }
            Collections.sort(this.f42864r, new Object());
            TLObject tLObject = null;
            int i13 = 0;
            while (i13 < this.f42864r.size()) {
                TLObject tLObject2 = (TLObject) this.f42864r.get(i13);
                if (tLObject != null) {
                    String a2 = n60.a(tLObject);
                    if (TextUtils.isEmpty(a2)) {
                        substring = "";
                    } else {
                        substring = a2.substring(0, 1);
                    }
                    String a10 = n60.a(tLObject2);
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
                ArrayList arrayList2 = this.f42864r;
                String a11 = n60.a(tLObject2);
                arrayList2.add(i13, new s60(TextUtils.isEmpty(a11) ? "" : a11.substring(0, 1)));
                i13++;
                tLObject = tLObject2;
            }
        }
        ig.a2 a2Var = new ig.a2(false);
        this.f42862f = a2Var;
        a2Var.f13987a = new st(this, 12);
    }

    @Override
    public final void A(s4.e1 e1Var) {
        View view = e1Var.f47773a;
        if (view instanceof org.telegram.ui.Cells.k4) {
            ((org.telegram.ui.Cells.k4) view).f24323a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47776f != 0) {
            t60 t60Var = this.I;
            if (t60Var.J != null) {
                View view = e1Var.f47773a;
                if (view instanceof org.telegram.ui.Cells.k4) {
                    Object object = ((org.telegram.ui.Cells.k4) view).getObject();
                    if ((object instanceof TLRPC.User) && t60Var.J.h(((TLRPC.User) object).f22177id) >= 0) {
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
        if (!this.f42863n && i10 >= this.E) {
            ArrayList arrayList = this.f42864r;
            int size = arrayList.size();
            int i11 = this.E;
            if (i10 < size + i11) {
                TLObject tLObject = (TLObject) arrayList.get(i10 - i11);
                if (tLObject instanceof s60) {
                    return ((s60) tLObject).f43244a;
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
    public final void G(org.telegram.ui.Components.nm0 nm0Var, float f7, int[] iArr) {
        iArr[0] = (int) (h() * f7);
        iArr[1] = 0;
    }

    public final void L(String str) {
        boolean z10;
        if (this.h != null) {
            Utilities.searchQueue.cancelRunnable(this.h);
            this.h = null;
        }
        this.d.clear();
        this.e.clear();
        this.f42862f.f(null, null);
        ig.a2 a2Var = this.f42862f;
        t60 t60Var = this.I;
        if (!t60Var.O && !t60Var.P) {
            z10 = false;
        } else {
            z10 = true;
        }
        a2Var.g(null, true, z10, false, false, 0L, false, 0, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            q60 q60Var = new q60(this, str, 0);
            this.h = q60Var;
            dispatchQueue2.postRunnable(q60Var, 300L);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        t60 t60Var = this.I;
        long j10 = t60Var.H;
        long j11 = t60Var.G;
        this.G = -1;
        this.f42865s = -1;
        this.f42866w = -1;
        this.v = -1;
        this.f42867x = -1;
        this.f42868y = -1;
        if (this.f42863n) {
            int size = this.d.size();
            ig.a2 a2Var = this.f42862f;
            int size2 = a2Var.d.size();
            int size3 = a2Var.e.size();
            int i12 = size + size2;
            if (size3 != 0) {
                i12 += size3 + 1;
            }
            this.H = i12;
            return i12;
        }
        if (t60Var.Q) {
            this.f42866w = 0;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (t60Var.V) {
            int i13 = i10 + 1;
            this.v = i10;
            this.f42865s = i10;
            i10 += 2;
            this.f42867x = i13;
        } else if (t60Var.W) {
            int i14 = i10 + 1;
            this.v = i10;
            this.f42865s = i10;
            i10 += 2;
            this.f42868y = i14;
        } else {
            this.v = i10;
        }
        this.E = i10;
        int size4 = this.f42864r.size() + i10;
        if (t60Var.R) {
            if (j11 != 0) {
                this.F = ChatObject.canUserDoAdminAction(t60Var.getMessagesController().getChat(Long.valueOf(j11)), 3) ? 1 : 0;
            } else if (j10 != 0) {
                TLRPC.Chat chat = t60Var.getMessagesController().getChat(Long.valueOf(j10));
                if (ChatObject.canUserDoAdminAction(chat, 3) && !ChatObject.isPublic(chat)) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
                this.F = i11;
            } else {
                this.F = 0;
            }
            if (this.F != 0) {
                this.E++;
                size4++;
            }
        }
        if (size4 == 0) {
            this.G = 0;
            size4++;
        }
        this.H = size4;
        return size4;
    }

    @Override
    public final int j(int i10) {
        if (this.f42863n) {
            if (i10 == this.f42862f.d.size() + this.d.size()) {
                return 0;
            }
            return 1;
        } else if (i10 != this.f42866w) {
            if (i10 != this.f42865s) {
                if (i10 != this.f42867x && i10 != this.f42868y) {
                    if (this.F != 0 && i10 == 0) {
                        return 2;
                    }
                    if (this.G == i10) {
                        return 3;
                    }
                    int i11 = i10 - this.E;
                    if (i11 >= 0) {
                        ArrayList arrayList = this.f42864r;
                        if (i11 < arrayList.size() && (arrayList.get(i10 - this.E) instanceof s60)) {
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
        this.I.s0();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        String string;
        TLObject tLObject;
        SpannableStringBuilder spannableStringBuilder;
        long j10;
        boolean z10;
        CharSequence charSequence;
        String publicUsername;
        int i11 = e1Var.f47776f;
        View view = e1Var.f47773a;
        ArrayList arrayList = this.f42864r;
        t60 t60Var = this.I;
        if (i11 != 0) {
            boolean z11 = true;
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                    if (i10 == this.f42866w) {
                        v8Var.o(R.drawable.menu_link_create2, LocaleController.getString(R.string.GroupCallCreateLink), false);
                        v8Var.g(org.telegram.ui.ActionBar.y6.f23693v6, org.telegram.ui.ActionBar.y6.f23674u6);
                        return;
                    } else if (this.F == 2) {
                        v8Var.o(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                        v8Var.g(org.telegram.ui.ActionBar.y6.f23521m6, org.telegram.ui.ActionBar.y6.G6);
                        return;
                    } else {
                        v8Var.o(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                        v8Var.g(org.telegram.ui.ActionBar.y6.f23521m6, org.telegram.ui.ActionBar.y6.G6);
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            SpannableStringBuilder spannableStringBuilder2 = null;
            if (this.f42863n) {
                int size = this.d.size();
                ig.a2 a2Var = this.f42862f;
                ArrayList arrayList2 = a2Var.e;
                ArrayList arrayList3 = a2Var.d;
                int size2 = arrayList2.size();
                int size3 = arrayList3.size();
                if (i10 >= 0 && i10 < size) {
                    tLObject = (TLObject) this.d.get(i10);
                } else if (i10 >= size && i10 < size3 + size) {
                    tLObject = (TLObject) arrayList3.get(i10 - size);
                } else if (i10 > size + size3 && i10 <= size2 + size + size3) {
                    tLObject = (TLObject) a2Var.e.get(((i10 - size) - size3) - 1);
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
                        String str = a2Var.f13989c;
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
                                spannableStringBuilder3.setSpan(new org.telegram.ui.Components.p10(org.telegram.ui.ActionBar.y6.f23598q6, null), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
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
            } else if (i10 == this.f42867x) {
                k4Var.f24328r = true;
                k4Var.f24326f = "premium";
                k4Var.f24323a.setImageDrawable(org.telegram.ui.Cells.k4.b(k4Var.getContext(), false));
                k4Var.f24324b.l(LocaleController.getString(R.string.PrivacyPremium), false);
                org.telegram.ui.ActionBar.b6 b6Var = k4Var.f24325c;
                int i12 = org.telegram.ui.ActionBar.y6.f23749y6;
                b6Var.setTag(Integer.valueOf(i12));
                if (k4Var.K) {
                    i12 = org.telegram.ui.ActionBar.y6.f23571og;
                }
                org.telegram.ui.ActionBar.f7.Y(b6Var, i12, k4Var.M);
                b6Var.setEmojiColor(b6Var.getTextColor());
                b6Var.l(LocaleController.getString(R.string.PrivacyPremiumText), false);
                if (t60Var.X == null) {
                    z11 = false;
                }
                k4Var.c(z11, false);
                return;
            } else if (i10 == this.f42868y) {
                k4Var.f24329s = true;
                k4Var.f24326f = "miniapps";
                org.telegram.ui.Components.y9 y9Var = k4Var.f24323a;
                k4Var.getContext();
                y9Var.setImageDrawable(org.telegram.ui.Cells.k4.a(false));
                k4Var.f24324b.l(LocaleController.getString(R.string.PrivacyMiniapps), false);
                org.telegram.ui.ActionBar.b6 b6Var2 = k4Var.f24325c;
                int i13 = org.telegram.ui.ActionBar.y6.f23749y6;
                b6Var2.setTag(Integer.valueOf(i13));
                if (k4Var.K) {
                    i13 = org.telegram.ui.ActionBar.y6.f23571og;
                }
                org.telegram.ui.ActionBar.f7.Y(b6Var2, i13, k4Var.M);
                b6Var2.setEmojiColor(b6Var2.getTextColor());
                b6Var2.l(LocaleController.getString(R.string.PrivacyMiniappsText), false);
                if (t60Var.Y == null) {
                    z11 = false;
                }
                k4Var.c(z11, false);
                return;
            } else {
                tLObject = (TLObject) arrayList.get(i10 - this.E);
                spannableStringBuilder = null;
            }
            k4Var.d(tLObject, spannableStringBuilder2, spannableStringBuilder);
            if (tLObject instanceof TLRPC.User) {
                j10 = ((TLRPC.User) tLObject).f22177id;
            } else if (tLObject instanceof TLRPC.Chat) {
                j10 = -((TLRPC.Chat) tLObject).f22028id;
            } else {
                j10 = 0;
            }
            if (j10 != 0) {
                a0.h hVar = t60Var.J;
                if (hVar != null && hVar.h(j10) >= 0) {
                    k4Var.c(true, false);
                    k4Var.setCheckBoxEnabled(false);
                    return;
                }
                if (t60Var.Z.h(j10) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k4Var.c(z10, false);
                k4Var.setCheckBoxEnabled(true);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
        if (this.f42863n) {
            z3Var.setText(LocaleController.getString(R.string.GlobalSearch));
        } else if (i10 == this.f42865s) {
            z3Var.setText(LocaleController.getString(R.string.PrivacyUserTypes));
        } else {
            int i14 = i10 - this.E;
            if (i14 >= 0 && i14 < arrayList.size()) {
                TLObject tLObject2 = (TLObject) arrayList.get(i10 - this.E);
                if (tLObject2 instanceof s60) {
                    z3Var.setText(((s60) tLObject2).f43244a.toUpperCase());
                }
            }
        }
        if (i10 == this.v) {
            if (t60Var.X == null && t60Var.Z.i()) {
                string = "";
            } else {
                string = LocaleController.getString(R.string.DeselectAll);
            }
            z3Var.a(string, new z50(this, 2));
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View z3Var;
        Context context = this.f42861c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    z3Var = new org.telegram.ui.Cells.v8(context);
                } else {
                    org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(0, 1, context, null, null);
                    s70Var.setLayoutParams(new s4.q0(-1, -1));
                    s70Var.e.setVisibility(8);
                    s70Var.d.setText(LocaleController.getString(R.string.NoContacts));
                    s70Var.setAnimateLayoutChange(true);
                    z3Var = s70Var;
                }
            } else {
                z3Var = new org.telegram.ui.Cells.k4(context, 1, 0, false);
            }
        } else {
            z3Var = new org.telegram.ui.Cells.z3(context, null);
        }
        return new s4.e1(z3Var);
    }
}

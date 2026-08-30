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
public final class w60 extends org.telegram.ui.Components.cl0 {
    public int B;
    public int C;
    public int D;
    public int E;
    public final y60 F;
    public final Context f39346c;
    public final tf.k1 f39347f;
    public Runnable h;
    public boolean f39348n;
    public int f39350s;
    public int v;
    public int f39351w;
    public int f39352x;
    public int f39353y;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList f39349r = new ArrayList();

    public w60(y60 y60Var, Context context) {
        TLRPC.Chat chat;
        String substring;
        String substring2;
        TLRPC.User user;
        this.F = y60Var;
        this.f39346c = context;
        HashSet hashSet = new HashSet();
        ContactsController contactsController = y60Var.getContactsController();
        boolean z4 = y60Var.N;
        ArrayList<TLRPC.TL_contact> arrayList = contactsController.contacts;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User user2 = y60Var.getMessagesController().getUser(Long.valueOf(arrayList.get(i10).user_id));
            if (user2 != null && !user2.self && !user2.deleted) {
                this.f39349r.add(user2);
                hashSet.add(Long.valueOf(user2.f19331id));
            }
        }
        if (y60Var.M || y60Var.L || z4) {
            ArrayList<TLRPC.Dialog> allDialogs = y60Var.getMessagesController().getAllDialogs();
            if (z4) {
                int size = allDialogs.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.Dialog dialog = allDialogs.get(i11);
                    if (DialogObject.isUserDialog(dialog.f19188id) && !hashSet.contains(Long.valueOf(dialog.f19188id)) && (user = y60Var.getMessagesController().getUser(Long.valueOf(dialog.f19188id))) != null && !UserObject.isDeleted(user) && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isService(dialog.f19188id) && !MessagesController.isSupportUser(user)) {
                        this.f39349r.add(user);
                        hashSet.add(Long.valueOf(user.f19331id));
                    }
                }
            } else {
                int size2 = allDialogs.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    TLRPC.Dialog dialog2 = allDialogs.get(i12);
                    if (DialogObject.isChatDialog(dialog2.f19188id) && (chat = y60Var.getMessagesController().getChat(Long.valueOf(-dialog2.f19188id))) != null && chat.migrated_to == null && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                        this.f39349r.add(chat);
                    }
                }
            }
            Collections.sort(this.f39349r, new Object());
            TLObject tLObject = null;
            int i13 = 0;
            while (i13 < this.f39349r.size()) {
                TLObject tLObject2 = (TLObject) this.f39349r.get(i13);
                if (tLObject != null) {
                    String a2 = s60.a(tLObject);
                    if (TextUtils.isEmpty(a2)) {
                        substring = "";
                    } else {
                        substring = a2.substring(0, 1);
                    }
                    String a10 = s60.a(tLObject2);
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
                ArrayList arrayList2 = this.f39349r;
                String a11 = s60.a(tLObject2);
                arrayList2.add(i13, new x60(TextUtils.isEmpty(a11) ? "" : a11.substring(0, 1)));
                i13++;
                tLObject = tLObject2;
            }
        }
        tf.k1 k1Var = new tf.k1(false);
        this.f39347f = k1Var;
        k1Var.f44769a = new fu(this, 11);
    }

    @Override
    public final void A(f2.l1 l1Var) {
        View view = l1Var.f5785a;
        if (view instanceof org.telegram.ui.Cells.g4) {
            ((org.telegram.ui.Cells.g4) view).f21088a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5788f != 0) {
            y60 y60Var = this.F;
            if (y60Var.G != null) {
                View view = l1Var.f5785a;
                if (view instanceof org.telegram.ui.Cells.g4) {
                    Object object = ((org.telegram.ui.Cells.g4) view).getObject();
                    if ((object instanceof TLRPC.User) && y60Var.G.h(((TLRPC.User) object).f19331id) >= 0) {
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
        if (!this.f39348n && i10 >= this.B) {
            ArrayList arrayList = this.f39349r;
            int size = arrayList.size();
            int i11 = this.B;
            if (i10 < size + i11) {
                TLObject tLObject = (TLObject) arrayList.get(i10 - i11);
                if (tLObject instanceof x60) {
                    return ((x60) tLObject).f39867a;
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
    public final void G(org.telegram.ui.Components.sl0 sl0Var, float f10, int[] iArr) {
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
        this.f39347f.f(null, null);
        tf.k1 k1Var = this.f39347f;
        y60 y60Var = this.F;
        if (!y60Var.L && !y60Var.M) {
            z4 = false;
        } else {
            z4 = true;
        }
        k1Var.g(null, true, z4, false, false, 0L, false, 0, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            v60 v60Var = new v60(this, str, 0);
            this.h = v60Var;
            dispatchQueue.postRunnable(v60Var, 300L);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        y60 y60Var = this.F;
        long j10 = y60Var.E;
        long j11 = y60Var.D;
        this.D = -1;
        this.f39350s = -1;
        this.f39351w = -1;
        this.v = -1;
        this.f39352x = -1;
        this.f39353y = -1;
        if (this.f39348n) {
            int size = this.d.size();
            tf.k1 k1Var = this.f39347f;
            int size2 = k1Var.d.size();
            int size3 = k1Var.e.size();
            int i12 = size + size2;
            if (size3 != 0) {
                i12 += size3 + 1;
            }
            this.E = i12;
            return i12;
        }
        if (y60Var.N) {
            this.f39351w = 0;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (y60Var.S) {
            int i13 = i10 + 1;
            this.v = i10;
            this.f39350s = i10;
            i10 += 2;
            this.f39352x = i13;
        } else if (y60Var.T) {
            int i14 = i10 + 1;
            this.v = i10;
            this.f39350s = i10;
            i10 += 2;
            this.f39353y = i14;
        } else {
            this.v = i10;
        }
        this.B = i10;
        int size4 = this.f39349r.size() + i10;
        if (y60Var.O) {
            if (j11 != 0) {
                this.C = ChatObject.canUserDoAdminAction(y60Var.getMessagesController().getChat(Long.valueOf(j11)), 3) ? 1 : 0;
            } else if (j10 != 0) {
                TLRPC.Chat chat = y60Var.getMessagesController().getChat(Long.valueOf(j10));
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
        if (this.f39348n) {
            if (i10 == this.f39347f.d.size() + this.d.size()) {
                return 0;
            }
            return 1;
        } else if (i10 != this.f39351w) {
            if (i10 != this.f39350s) {
                if (i10 != this.f39352x && i10 != this.f39353y) {
                    if (this.C != 0 && i10 == 0) {
                        return 2;
                    }
                    if (this.D == i10) {
                        return 3;
                    }
                    int i11 = i10 - this.B;
                    if (i11 >= 0) {
                        ArrayList arrayList = this.f39349r;
                        if (i11 < arrayList.size() && (arrayList.get(i10 - this.B) instanceof x60)) {
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
        int i11 = l1Var.f5788f;
        View view = l1Var.f5785a;
        ArrayList arrayList = this.f39349r;
        y60 y60Var = this.F;
        if (i11 != 0) {
            boolean z10 = true;
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                    if (i10 == this.f39351w) {
                        o8Var.m(R.drawable.menu_link_create2, LocaleController.getString(R.string.GroupCallCreateLink), false);
                        o8Var.e(org.telegram.ui.ActionBar.j6.f20225v6, org.telegram.ui.ActionBar.j6.f20207u6);
                        return;
                    } else if (this.C == 2) {
                        o8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                        o8Var.e(org.telegram.ui.ActionBar.j6.f20067m6, org.telegram.ui.ActionBar.j6.G6);
                        return;
                    } else {
                        o8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                        o8Var.e(org.telegram.ui.ActionBar.j6.f20067m6, org.telegram.ui.ActionBar.j6.G6);
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            SpannableStringBuilder spannableStringBuilder2 = null;
            if (this.f39348n) {
                int size = this.d.size();
                tf.k1 k1Var = this.f39347f;
                ArrayList arrayList2 = k1Var.e;
                ArrayList arrayList3 = k1Var.d;
                int size2 = arrayList2.size();
                int size3 = arrayList3.size();
                if (i10 >= 0 && i10 < size) {
                    tLObject = (TLObject) this.d.get(i10);
                } else if (i10 >= size && i10 < size3 + size) {
                    tLObject = (TLObject) arrayList3.get(i10 - size);
                } else if (i10 > size + size3 && i10 <= size2 + size + size3) {
                    tLObject = (TLObject) k1Var.e.get(((i10 - size) - size3) - 1);
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
                        String str = k1Var.f44771c;
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
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20140q6, false)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
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
            } else if (i10 == this.f39352x) {
                g4Var.f21093r = true;
                g4Var.f21091f = "premium";
                g4Var.f21088a.setImageDrawable(org.telegram.ui.Cells.g4.b(g4Var.getContext(), false));
                g4Var.f21089b.l(LocaleController.getString(R.string.PrivacyPremium), false);
                org.telegram.ui.ActionBar.k5 k5Var = g4Var.f21090c;
                int i12 = org.telegram.ui.ActionBar.j6.f20281y6;
                k5Var.setTag(Integer.valueOf(i12));
                if (g4Var.H) {
                    i12 = org.telegram.ui.ActionBar.j6.f20112og;
                }
                k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, g4Var.J));
                k5Var.setEmojiColor(k5Var.getTextColor());
                k5Var.l(LocaleController.getString(R.string.PrivacyPremiumText), false);
                if (y60Var.U == null) {
                    z10 = false;
                }
                g4Var.c(z10, false);
                return;
            } else if (i10 == this.f39353y) {
                g4Var.f21094s = true;
                g4Var.f21091f = "miniapps";
                org.telegram.ui.Components.p9 p9Var = g4Var.f21088a;
                g4Var.getContext();
                p9Var.setImageDrawable(org.telegram.ui.Cells.g4.a(false));
                g4Var.f21089b.l(LocaleController.getString(R.string.PrivacyMiniapps), false);
                org.telegram.ui.ActionBar.k5 k5Var2 = g4Var.f21090c;
                int i13 = org.telegram.ui.ActionBar.j6.f20281y6;
                k5Var2.setTag(Integer.valueOf(i13));
                if (g4Var.H) {
                    i13 = org.telegram.ui.ActionBar.j6.f20112og;
                }
                k5Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, g4Var.J));
                k5Var2.setEmojiColor(k5Var2.getTextColor());
                k5Var2.l(LocaleController.getString(R.string.PrivacyMiniappsText), false);
                if (y60Var.V == null) {
                    z10 = false;
                }
                g4Var.c(z10, false);
                return;
            } else {
                tLObject = (TLObject) arrayList.get(i10 - this.B);
                spannableStringBuilder = null;
            }
            g4Var.d(tLObject, spannableStringBuilder2, spannableStringBuilder);
            if (tLObject instanceof TLRPC.User) {
                j10 = ((TLRPC.User) tLObject).f19331id;
            } else if (tLObject instanceof TLRPC.Chat) {
                j10 = -((TLRPC.Chat) tLObject).f19184id;
            } else {
                j10 = 0;
            }
            if (j10 != 0) {
                a0.h hVar = y60Var.G;
                if (hVar != null && hVar.h(j10) >= 0) {
                    g4Var.c(true, false);
                    g4Var.setCheckBoxEnabled(false);
                    return;
                }
                if (y60Var.W.h(j10) >= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                g4Var.c(z4, false);
                g4Var.setCheckBoxEnabled(true);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
        if (this.f39348n) {
            u3Var.setText(LocaleController.getString(R.string.GlobalSearch));
        } else if (i10 == this.f39350s) {
            u3Var.setText(LocaleController.getString(R.string.PrivacyUserTypes));
        } else {
            int i14 = i10 - this.B;
            if (i14 >= 0 && i14 < arrayList.size()) {
                TLObject tLObject2 = (TLObject) arrayList.get(i10 - this.B);
                if (tLObject2 instanceof x60) {
                    u3Var.setText(((x60) tLObject2).f39867a.toUpperCase());
                }
            }
        }
        if (i10 == this.v) {
            if (y60Var.U == null && y60Var.W.i()) {
                string = "";
            } else {
                string = LocaleController.getString(R.string.DeselectAll);
            }
            u3Var.b(string, new e60(this, 2));
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View u3Var;
        Context context = this.f39346c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    u3Var = new org.telegram.ui.Cells.o8(context);
                } else {
                    org.telegram.ui.Components.v60 v60Var = new org.telegram.ui.Components.v60(context, null, 0, null, 1);
                    v60Var.setLayoutParams(new f2.w0(-1, -1));
                    v60Var.e.setVisibility(8);
                    v60Var.d.setText(LocaleController.getString(R.string.NoContacts));
                    v60Var.setAnimateLayoutChange(true);
                    u3Var = v60Var;
                }
            } else {
                u3Var = new org.telegram.ui.Cells.g4(context, 1, 0, false);
            }
        } else {
            u3Var = new org.telegram.ui.Cells.u3(context, null);
        }
        return new f2.l1(u3Var);
    }
}

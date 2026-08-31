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
public final class x60 extends org.telegram.ui.Components.dl0 {
    public int B;
    public int C;
    public int D;
    public int E;
    public final z60 F;
    public final Context f42979c;
    public final uf.k1 f42981f;
    public Runnable h;
    public boolean f42982n;
    public int f42984s;
    public int v;
    public int f42985w;
    public int f42986x;
    public int f42987y;
    public ArrayList d = new ArrayList();
    public ArrayList f42980e = new ArrayList();
    public final ArrayList f42983r = new ArrayList();

    public x60(z60 z60Var, Context context) {
        TLRPC.Chat chat;
        String substring;
        String substring2;
        TLRPC.User user;
        this.F = z60Var;
        this.f42979c = context;
        HashSet hashSet = new HashSet();
        ContactsController contactsController = z60Var.getContactsController();
        boolean z4 = z60Var.N;
        ArrayList<TLRPC.TL_contact> arrayList = contactsController.contacts;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User user2 = z60Var.getMessagesController().getUser(Long.valueOf(arrayList.get(i10).user_id));
            if (user2 != null && !user2.self && !user2.deleted) {
                this.f42983r.add(user2);
                hashSet.add(Long.valueOf(user2.f20990id));
            }
        }
        if (z60Var.M || z60Var.L || z4) {
            ArrayList<TLRPC.Dialog> allDialogs = z60Var.getMessagesController().getAllDialogs();
            if (z4) {
                int size = allDialogs.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.Dialog dialog = allDialogs.get(i11);
                    if (DialogObject.isUserDialog(dialog.f20847id) && !hashSet.contains(Long.valueOf(dialog.f20847id)) && (user = z60Var.getMessagesController().getUser(Long.valueOf(dialog.f20847id))) != null && !UserObject.isDeleted(user) && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isService(dialog.f20847id) && !MessagesController.isSupportUser(user)) {
                        this.f42983r.add(user);
                        hashSet.add(Long.valueOf(user.f20990id));
                    }
                }
            } else {
                int size2 = allDialogs.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    TLRPC.Dialog dialog2 = allDialogs.get(i12);
                    if (DialogObject.isChatDialog(dialog2.f20847id) && (chat = z60Var.getMessagesController().getChat(Long.valueOf(-dialog2.f20847id))) != null && chat.migrated_to == null && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                        this.f42983r.add(chat);
                    }
                }
            }
            Collections.sort(this.f42983r, new Object());
            TLObject tLObject = null;
            int i13 = 0;
            while (i13 < this.f42983r.size()) {
                TLObject tLObject2 = (TLObject) this.f42983r.get(i13);
                if (tLObject != null) {
                    String a2 = t60.a(tLObject);
                    if (TextUtils.isEmpty(a2)) {
                        substring = "";
                    } else {
                        substring = a2.substring(0, 1);
                    }
                    String a10 = t60.a(tLObject2);
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
                ArrayList arrayList2 = this.f42983r;
                String a11 = t60.a(tLObject2);
                arrayList2.add(i13, new y60(TextUtils.isEmpty(a11) ? "" : a11.substring(0, 1)));
                i13++;
                tLObject = tLObject2;
            }
        }
        uf.k1 k1Var = new uf.k1(false);
        this.f42981f = k1Var;
        k1Var.f48618a = new gu(this, 11);
    }

    @Override
    public final void A(f2.m1 m1Var) {
        View view = m1Var.f5875a;
        if (view instanceof org.telegram.ui.Cells.g4) {
            ((org.telegram.ui.Cells.g4) view).f22836a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f != 0) {
            z60 z60Var = this.F;
            if (z60Var.G != null) {
                View view = m1Var.f5875a;
                if (view instanceof org.telegram.ui.Cells.g4) {
                    Object object = ((org.telegram.ui.Cells.g4) view).getObject();
                    if ((object instanceof TLRPC.User) && z60Var.G.h(((TLRPC.User) object).f20990id) >= 0) {
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
        if (!this.f42982n && i10 >= this.B) {
            ArrayList arrayList = this.f42983r;
            int size = arrayList.size();
            int i11 = this.B;
            if (i10 < size + i11) {
                TLObject tLObject = (TLObject) arrayList.get(i10 - i11);
                if (tLObject instanceof y60) {
                    return ((y60) tLObject).f43568a;
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
    public final void G(org.telegram.ui.Components.tl0 tl0Var, float f10, int[] iArr) {
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
        this.f42980e.clear();
        this.f42981f.f(null, null);
        uf.k1 k1Var = this.f42981f;
        z60 z60Var = this.F;
        if (!z60Var.L && !z60Var.M) {
            z4 = false;
        } else {
            z4 = true;
        }
        k1Var.g(null, true, z4, false, false, 0L, false, 0, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            w60 w60Var = new w60(this, str, 0);
            this.h = w60Var;
            dispatchQueue.postRunnable(w60Var, 300L);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        z60 z60Var = this.F;
        long j10 = z60Var.E;
        long j11 = z60Var.D;
        this.D = -1;
        this.f42984s = -1;
        this.f42985w = -1;
        this.v = -1;
        this.f42986x = -1;
        this.f42987y = -1;
        if (this.f42982n) {
            int size = this.d.size();
            uf.k1 k1Var = this.f42981f;
            int size2 = k1Var.d.size();
            int size3 = k1Var.f48621e.size();
            int i12 = size + size2;
            if (size3 != 0) {
                i12 += size3 + 1;
            }
            this.E = i12;
            return i12;
        }
        if (z60Var.N) {
            this.f42985w = 0;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (z60Var.S) {
            int i13 = i10 + 1;
            this.v = i10;
            this.f42984s = i10;
            i10 += 2;
            this.f42986x = i13;
        } else if (z60Var.T) {
            int i14 = i10 + 1;
            this.v = i10;
            this.f42984s = i10;
            i10 += 2;
            this.f42987y = i14;
        } else {
            this.v = i10;
        }
        this.B = i10;
        int size4 = this.f42983r.size() + i10;
        if (z60Var.O) {
            if (j11 != 0) {
                this.C = ChatObject.canUserDoAdminAction(z60Var.getMessagesController().getChat(Long.valueOf(j11)), 3) ? 1 : 0;
            } else if (j10 != 0) {
                TLRPC.Chat chat = z60Var.getMessagesController().getChat(Long.valueOf(j10));
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
        if (this.f42982n) {
            if (i10 == this.f42981f.d.size() + this.d.size()) {
                return 0;
            }
            return 1;
        } else if (i10 != this.f42985w) {
            if (i10 != this.f42984s) {
                if (i10 != this.f42986x && i10 != this.f42987y) {
                    if (this.C != 0 && i10 == 0) {
                        return 2;
                    }
                    if (this.D == i10) {
                        return 3;
                    }
                    int i11 = i10 - this.B;
                    if (i11 >= 0) {
                        ArrayList arrayList = this.f42983r;
                        if (i11 < arrayList.size() && (arrayList.get(i10 - this.B) instanceof y60)) {
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
    public final void v(f2.m1 m1Var, int i10) {
        String string;
        TLObject tLObject;
        SpannableStringBuilder spannableStringBuilder;
        long j10;
        boolean z4;
        CharSequence charSequence;
        String publicUsername;
        int i11 = m1Var.f5879f;
        View view = m1Var.f5875a;
        ArrayList arrayList = this.f42983r;
        z60 z60Var = this.F;
        if (i11 != 0) {
            boolean z10 = true;
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                    if (i10 == this.f42985w) {
                        o8Var.m(R.drawable.menu_link_create2, LocaleController.getString(R.string.GroupCallCreateLink), false);
                        o8Var.e(org.telegram.ui.ActionBar.k6.f21979v6, org.telegram.ui.ActionBar.k6.f21961u6);
                        return;
                    } else if (this.C == 2) {
                        o8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                        o8Var.e(org.telegram.ui.ActionBar.k6.f21821m6, org.telegram.ui.ActionBar.k6.G6);
                        return;
                    } else {
                        o8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                        o8Var.e(org.telegram.ui.ActionBar.k6.f21821m6, org.telegram.ui.ActionBar.k6.G6);
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            SpannableStringBuilder spannableStringBuilder2 = null;
            if (this.f42982n) {
                int size = this.d.size();
                uf.k1 k1Var = this.f42981f;
                ArrayList arrayList2 = k1Var.f48621e;
                ArrayList arrayList3 = k1Var.d;
                int size2 = arrayList2.size();
                int size3 = arrayList3.size();
                if (i10 >= 0 && i10 < size) {
                    tLObject = (TLObject) this.d.get(i10);
                } else if (i10 >= size && i10 < size3 + size) {
                    tLObject = (TLObject) arrayList3.get(i10 - size);
                } else if (i10 > size + size3 && i10 <= size2 + size + size3) {
                    tLObject = (TLObject) k1Var.f48621e.get(((i10 - size) - size3) - 1);
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
                        charSequence = (CharSequence) this.f42980e.get(i10);
                        if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
                            if (charSequence.toString().startsWith("@" + publicUsername)) {
                                spannableStringBuilder2 = charSequence;
                                charSequence = null;
                            }
                        }
                    } else if (i10 > size && !TextUtils.isEmpty(publicUsername)) {
                        String str = k1Var.f48620c;
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
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21894q6, false)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
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
            } else if (i10 == this.f42986x) {
                g4Var.f22842r = true;
                g4Var.f22840f = "premium";
                g4Var.f22836a.setImageDrawable(org.telegram.ui.Cells.g4.b(g4Var.getContext(), false));
                g4Var.f22837b.l(LocaleController.getString(R.string.PrivacyPremium), false);
                org.telegram.ui.ActionBar.l5 l5Var = g4Var.f22838c;
                int i12 = org.telegram.ui.ActionBar.k6.f22036y6;
                l5Var.setTag(Integer.valueOf(i12));
                if (g4Var.H) {
                    i12 = org.telegram.ui.ActionBar.k6.f21866og;
                }
                l5Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i12, g4Var.J));
                l5Var.setEmojiColor(l5Var.getTextColor());
                l5Var.l(LocaleController.getString(R.string.PrivacyPremiumText), false);
                if (z60Var.U == null) {
                    z10 = false;
                }
                g4Var.c(z10, false);
                return;
            } else if (i10 == this.f42987y) {
                g4Var.f22843s = true;
                g4Var.f22840f = "miniapps";
                org.telegram.ui.Components.p9 p9Var = g4Var.f22836a;
                g4Var.getContext();
                p9Var.setImageDrawable(org.telegram.ui.Cells.g4.a(false));
                g4Var.f22837b.l(LocaleController.getString(R.string.PrivacyMiniapps), false);
                org.telegram.ui.ActionBar.l5 l5Var2 = g4Var.f22838c;
                int i13 = org.telegram.ui.ActionBar.k6.f22036y6;
                l5Var2.setTag(Integer.valueOf(i13));
                if (g4Var.H) {
                    i13 = org.telegram.ui.ActionBar.k6.f21866og;
                }
                l5Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, g4Var.J));
                l5Var2.setEmojiColor(l5Var2.getTextColor());
                l5Var2.l(LocaleController.getString(R.string.PrivacyMiniappsText), false);
                if (z60Var.V == null) {
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
                j10 = ((TLRPC.User) tLObject).f20990id;
            } else if (tLObject instanceof TLRPC.Chat) {
                j10 = -((TLRPC.Chat) tLObject).f20843id;
            } else {
                j10 = 0;
            }
            if (j10 != 0) {
                a0.h hVar = z60Var.G;
                if (hVar != null && hVar.h(j10) >= 0) {
                    g4Var.c(true, false);
                    g4Var.setCheckBoxEnabled(false);
                    return;
                }
                if (z60Var.W.h(j10) >= 0) {
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
        if (this.f42982n) {
            u3Var.setText(LocaleController.getString(R.string.GlobalSearch));
        } else if (i10 == this.f42984s) {
            u3Var.setText(LocaleController.getString(R.string.PrivacyUserTypes));
        } else {
            int i14 = i10 - this.B;
            if (i14 >= 0 && i14 < arrayList.size()) {
                TLObject tLObject2 = (TLObject) arrayList.get(i10 - this.B);
                if (tLObject2 instanceof y60) {
                    u3Var.setText(((y60) tLObject2).f43568a.toUpperCase());
                }
            }
        }
        if (i10 == this.v) {
            if (z60Var.U == null && z60Var.W.i()) {
                string = "";
            } else {
                string = LocaleController.getString(R.string.DeselectAll);
            }
            u3Var.b(string, new f60(this, 2));
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View u3Var;
        Context context = this.f42979c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    u3Var = new org.telegram.ui.Cells.o8(context);
                } else {
                    org.telegram.ui.Components.x60 x60Var = new org.telegram.ui.Components.x60(context, null, 0, null, 1);
                    x60Var.setLayoutParams(new f2.x0(-1, -1));
                    x60Var.f25364e.setVisibility(8);
                    x60Var.d.setText(LocaleController.getString(R.string.NoContacts));
                    x60Var.setAnimateLayoutChange(true);
                    u3Var = x60Var;
                }
            } else {
                u3Var = new org.telegram.ui.Cells.g4(context, 1, 0, false);
            }
        } else {
            u3Var = new org.telegram.ui.Cells.u3(context, null);
        }
        return new f2.m1(u3Var);
    }
}

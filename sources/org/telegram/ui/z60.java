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
public final class z60 extends org.telegram.ui.Components.uk0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public final b70 I;
    public final Context f39993c;
    public final gg.c2 f39994f;
    public Runnable h;
    public boolean f39995n;
    public int f39997s;
    public int v;
    public int f39998w;
    public int f39999x;
    public int f40000y;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList f39996r = new ArrayList();

    public z60(b70 b70Var, Context context) {
        TLRPC.Chat chat;
        String substring;
        String substring2;
        TLRPC.User user;
        this.I = b70Var;
        this.f39993c = context;
        HashSet hashSet = new HashSet();
        ContactsController contactsController = b70Var.getContactsController();
        boolean z10 = b70Var.Q;
        ArrayList<TLRPC.TL_contact> arrayList = contactsController.contacts;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User user2 = b70Var.getMessagesController().getUser(Long.valueOf(arrayList.get(i10).user_id));
            if (user2 != null && !user2.self && !user2.deleted) {
                this.f39996r.add(user2);
                hashSet.add(Long.valueOf(user2.f18230id));
            }
        }
        if (b70Var.P || b70Var.O || z10) {
            ArrayList<TLRPC.Dialog> allDialogs = b70Var.getMessagesController().getAllDialogs();
            if (z10) {
                int size = allDialogs.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.Dialog dialog = allDialogs.get(i11);
                    if (DialogObject.isUserDialog(dialog.f18087id) && !hashSet.contains(Long.valueOf(dialog.f18087id)) && (user = b70Var.getMessagesController().getUser(Long.valueOf(dialog.f18087id))) != null && !UserObject.isDeleted(user) && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isService(dialog.f18087id) && !MessagesController.isSupportUser(user)) {
                        this.f39996r.add(user);
                        hashSet.add(Long.valueOf(user.f18230id));
                    }
                }
            } else {
                int size2 = allDialogs.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    TLRPC.Dialog dialog2 = allDialogs.get(i12);
                    if (DialogObject.isChatDialog(dialog2.f18087id) && (chat = b70Var.getMessagesController().getChat(Long.valueOf(-dialog2.f18087id))) != null && chat.migrated_to == null && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                        this.f39996r.add(chat);
                    }
                }
            }
            Collections.sort(this.f39996r, new Object());
            TLObject tLObject = null;
            int i13 = 0;
            while (i13 < this.f39996r.size()) {
                TLObject tLObject2 = (TLObject) this.f39996r.get(i13);
                if (tLObject != null) {
                    String a2 = v60.a(tLObject);
                    if (TextUtils.isEmpty(a2)) {
                        substring = "";
                    } else {
                        substring = a2.substring(0, 1);
                    }
                    String a10 = v60.a(tLObject2);
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
                ArrayList arrayList2 = this.f39996r;
                String a11 = v60.a(tLObject2);
                arrayList2.add(i13, new a70(TextUtils.isEmpty(a11) ? "" : a11.substring(0, 1)));
                i13++;
                tLObject = tLObject2;
            }
        }
        gg.c2 c2Var = new gg.c2(false);
        this.f39994f = c2Var;
        c2Var.f9672a = new eu(this, 11);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42627a;
        if (view instanceof org.telegram.ui.Cells.g4) {
            ((org.telegram.ui.Cells.g4) view).f20086a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42630f != 0) {
            b70 b70Var = this.I;
            if (b70Var.J != null) {
                View view = c1Var.f42627a;
                if (view instanceof org.telegram.ui.Cells.g4) {
                    Object object = ((org.telegram.ui.Cells.g4) view).getObject();
                    if ((object instanceof TLRPC.User) && b70Var.J.h(((TLRPC.User) object).f18230id) >= 0) {
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
        if (!this.f39995n && i10 >= this.E) {
            ArrayList arrayList = this.f39996r;
            int size = arrayList.size();
            int i11 = this.E;
            if (i10 < size + i11) {
                TLObject tLObject = (TLObject) arrayList.get(i10 - i11);
                if (tLObject instanceof a70) {
                    return ((a70) tLObject).f31689a;
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
    public final void G(org.telegram.ui.Components.ml0 ml0Var, float f7, int[] iArr) {
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
        this.f39994f.f(null, null);
        gg.c2 c2Var = this.f39994f;
        b70 b70Var = this.I;
        if (!b70Var.O && !b70Var.P) {
            z10 = false;
        } else {
            z10 = true;
        }
        c2Var.g(null, true, z10, false, false, 0L, false, 0, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            y60 y60Var = new y60(this, str, 0);
            this.h = y60Var;
            dispatchQueue.postRunnable(y60Var, 300L);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        b70 b70Var = this.I;
        long j3 = b70Var.H;
        long j10 = b70Var.G;
        this.G = -1;
        this.f39997s = -1;
        this.f39998w = -1;
        this.v = -1;
        this.f39999x = -1;
        this.f40000y = -1;
        if (this.f39995n) {
            int size = this.d.size();
            gg.c2 c2Var = this.f39994f;
            int size2 = c2Var.d.size();
            int size3 = c2Var.e.size();
            int i12 = size + size2;
            if (size3 != 0) {
                i12 += size3 + 1;
            }
            this.H = i12;
            return i12;
        }
        if (b70Var.Q) {
            this.f39998w = 0;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (b70Var.V) {
            int i13 = i10 + 1;
            this.v = i10;
            this.f39997s = i10;
            i10 += 2;
            this.f39999x = i13;
        } else if (b70Var.W) {
            int i14 = i10 + 1;
            this.v = i10;
            this.f39997s = i10;
            i10 += 2;
            this.f40000y = i14;
        } else {
            this.v = i10;
        }
        this.E = i10;
        int size4 = this.f39996r.size() + i10;
        if (b70Var.R) {
            if (j10 != 0) {
                this.F = ChatObject.canUserDoAdminAction(b70Var.getMessagesController().getChat(Long.valueOf(j10)), 3) ? 1 : 0;
            } else if (j3 != 0) {
                TLRPC.Chat chat = b70Var.getMessagesController().getChat(Long.valueOf(j3));
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
        if (this.f39995n) {
            if (i10 == this.f39994f.d.size() + this.d.size()) {
                return 0;
            }
            return 1;
        } else if (i10 != this.f39998w) {
            if (i10 != this.f39997s) {
                if (i10 != this.f39999x && i10 != this.f40000y) {
                    if (this.F != 0 && i10 == 0) {
                        return 2;
                    }
                    if (this.G == i10) {
                        return 3;
                    }
                    int i11 = i10 - this.E;
                    if (i11 >= 0) {
                        ArrayList arrayList = this.f39996r;
                        if (i11 < arrayList.size() && (arrayList.get(i10 - this.E) instanceof a70)) {
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
        this.I.r0();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String string;
        TLObject tLObject;
        SpannableStringBuilder spannableStringBuilder;
        long j3;
        boolean z10;
        CharSequence charSequence;
        String publicUsername;
        int i11 = c1Var.f42630f;
        View view = c1Var.f42627a;
        ArrayList arrayList = this.f39996r;
        b70 b70Var = this.I;
        if (i11 != 0) {
            boolean z11 = true;
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                    if (i10 == this.f39998w) {
                        s8Var.m(R.drawable.menu_link_create2, LocaleController.getString(R.string.GroupCallCreateLink), false);
                        s8Var.e(org.telegram.ui.ActionBar.h6.f19118v6, org.telegram.ui.ActionBar.h6.f19100u6);
                        return;
                    } else if (this.F == 2) {
                        s8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                        s8Var.e(org.telegram.ui.ActionBar.h6.f18953m6, org.telegram.ui.ActionBar.h6.G6);
                        return;
                    } else {
                        s8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                        s8Var.e(org.telegram.ui.ActionBar.h6.f18953m6, org.telegram.ui.ActionBar.h6.G6);
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            SpannableStringBuilder spannableStringBuilder2 = null;
            if (this.f39995n) {
                int size = this.d.size();
                gg.c2 c2Var = this.f39994f;
                ArrayList arrayList2 = c2Var.e;
                ArrayList arrayList3 = c2Var.d;
                int size2 = arrayList2.size();
                int size3 = arrayList3.size();
                if (i10 >= 0 && i10 < size) {
                    tLObject = (TLObject) this.d.get(i10);
                } else if (i10 >= size && i10 < size3 + size) {
                    tLObject = (TLObject) arrayList3.get(i10 - size);
                } else if (i10 > size + size3 && i10 <= size2 + size + size3) {
                    tLObject = (TLObject) c2Var.e.get(((i10 - size) - size3) - 1);
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
                        String str = c2Var.f9674c;
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
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q6, false)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
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
            } else if (i10 == this.f39999x) {
                g4Var.f20091r = true;
                g4Var.f20089f = "premium";
                g4Var.f20086a.setImageDrawable(org.telegram.ui.Cells.g4.b(g4Var.getContext(), false));
                g4Var.f20087b.l(LocaleController.getString(R.string.PrivacyPremium), false);
                org.telegram.ui.ActionBar.i5 i5Var = g4Var.f20088c;
                int i12 = org.telegram.ui.ActionBar.h6.f19170y6;
                i5Var.setTag(Integer.valueOf(i12));
                if (g4Var.K) {
                    i12 = org.telegram.ui.ActionBar.h6.f18999og;
                }
                i5Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i12, g4Var.M));
                i5Var.setEmojiColor(i5Var.getTextColor());
                i5Var.l(LocaleController.getString(R.string.PrivacyPremiumText), false);
                if (b70Var.X == null) {
                    z11 = false;
                }
                g4Var.c(z11, false);
                return;
            } else if (i10 == this.f40000y) {
                g4Var.f20092s = true;
                g4Var.f20089f = "miniapps";
                org.telegram.ui.Components.w9 w9Var = g4Var.f20086a;
                g4Var.getContext();
                w9Var.setImageDrawable(org.telegram.ui.Cells.g4.a(false));
                g4Var.f20087b.l(LocaleController.getString(R.string.PrivacyMiniapps), false);
                org.telegram.ui.ActionBar.i5 i5Var2 = g4Var.f20088c;
                int i13 = org.telegram.ui.ActionBar.h6.f19170y6;
                i5Var2.setTag(Integer.valueOf(i13));
                if (g4Var.K) {
                    i13 = org.telegram.ui.ActionBar.h6.f18999og;
                }
                i5Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(i13, g4Var.M));
                i5Var2.setEmojiColor(i5Var2.getTextColor());
                i5Var2.l(LocaleController.getString(R.string.PrivacyMiniappsText), false);
                if (b70Var.Y == null) {
                    z11 = false;
                }
                g4Var.c(z11, false);
                return;
            } else {
                tLObject = (TLObject) arrayList.get(i10 - this.E);
                spannableStringBuilder = null;
            }
            g4Var.d(tLObject, spannableStringBuilder2, spannableStringBuilder);
            if (tLObject instanceof TLRPC.User) {
                j3 = ((TLRPC.User) tLObject).f18230id;
            } else if (tLObject instanceof TLRPC.Chat) {
                j3 = -((TLRPC.Chat) tLObject).f18083id;
            } else {
                j3 = 0;
            }
            if (j3 != 0) {
                a0.i iVar = b70Var.J;
                if (iVar != null && iVar.h(j3) >= 0) {
                    g4Var.c(true, false);
                    g4Var.setCheckBoxEnabled(false);
                    return;
                }
                if (b70Var.Z.h(j3) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g4Var.c(z10, false);
                g4Var.setCheckBoxEnabled(true);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
        if (this.f39995n) {
            v3Var.setText(LocaleController.getString(R.string.GlobalSearch));
        } else if (i10 == this.f39997s) {
            v3Var.setText(LocaleController.getString(R.string.PrivacyUserTypes));
        } else {
            int i14 = i10 - this.E;
            if (i14 >= 0 && i14 < arrayList.size()) {
                TLObject tLObject2 = (TLObject) arrayList.get(i10 - this.E);
                if (tLObject2 instanceof a70) {
                    v3Var.setText(((a70) tLObject2).f31689a.toUpperCase());
                }
            }
        }
        if (i10 == this.v) {
            if (b70Var.X == null && b70Var.Z.i()) {
                string = "";
            } else {
                string = LocaleController.getString(R.string.DeselectAll);
            }
            v3Var.b(string, new h60(this, 2));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View v3Var;
        Context context = this.f39993c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    v3Var = new org.telegram.ui.Cells.s8(context);
                } else {
                    org.telegram.ui.Components.v60 v60Var = new org.telegram.ui.Components.v60(context, null, 0, null, 1);
                    v60Var.setLayoutParams(new s4.p0(-1, -1));
                    v60Var.e.setVisibility(8);
                    v60Var.d.setText(LocaleController.getString(R.string.NoContacts));
                    v60Var.setAnimateLayoutChange(true);
                    v3Var = v60Var;
                }
            } else {
                v3Var = new org.telegram.ui.Cells.g4(context, 1, 0, false);
            }
        } else {
            v3Var = new org.telegram.ui.Cells.v3(context, null);
        }
        return new s4.c1(v3Var);
    }
}

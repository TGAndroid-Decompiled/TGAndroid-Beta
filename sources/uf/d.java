package uf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.c3;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Cells.r4;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.hc1;
import org.telegram.ui.yh;
public abstract class d extends pl0 {
    public final boolean B;
    public int C;
    public final boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final int f48528r = UserConfig.selectedAccount;
    public final Context f48529s;
    public final int v;
    public final boolean f48530w;
    public final a0.h f48531x;
    public ArrayList f48532y;

    public d(Context context, int i10, boolean z4, a0.h hVar, int i11) {
        boolean z10;
        this.f48529s = context;
        this.v = i10;
        this.f48530w = z4;
        this.f48531x = hVar;
        if (i11 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.B = z10;
        this.D = i11 == 2;
    }

    @Override
    public final String F(int i10) {
        ArrayList<String> arrayList;
        if (this.C != 2 && !this.F) {
            int i11 = this.f48528r;
            int i12 = this.v;
            ContactsController contactsController = ContactsController.getInstance(i11);
            if (i12 == 2) {
                arrayList = contactsController.sortedUsersMutualSectionsArray;
            } else {
                arrayList = contactsController.sortedUsersSectionsArray;
            }
            int S = S(i10);
            if (S == -1) {
                S = arrayList.size() - 1;
            }
            if (i12 != 0 && !this.B) {
                if (S >= 0 && S < arrayList.size()) {
                    return arrayList.get(S);
                }
            } else if (S > 0 && S <= arrayList.size()) {
                return arrayList.get(S - 1);
            }
        }
        return null;
    }

    @Override
    public final void G(tl0 tl0Var, float f10, int[] iArr) {
        iArr[0] = (int) (h() * f10);
        iArr[1] = 0;
    }

    @Override
    public final int M(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: uf.d.M(int):int");
    }

    @Override
    public final int N(int i10, int i11) {
        return Objects.hash(Integer.valueOf(i10 * (-49612)), O(i10, i11));
    }

    @Override
    public final Object O(int i10, int i11) {
        HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap;
        ArrayList<String> arrayList;
        int i12;
        boolean z4 = this.H;
        int i13 = this.f48528r;
        if (z4 && i10 == 1 && i11 > 1 && i11 - 2 < ContactsController.getInstance(i13).phoneBookContacts.size()) {
            return ContactsController.getInstance(i13).phoneBookContacts.get(i12);
        }
        if (P(i10, i11) == 2) {
            return "Header";
        }
        int i14 = this.v;
        ContactsController contactsController = ContactsController.getInstance(i13);
        if (i14 == 2) {
            hashMap = contactsController.usersMutualSectionsDict;
        } else {
            hashMap = contactsController.usersSectionsDict;
        }
        ContactsController contactsController2 = ContactsController.getInstance(i13);
        if (i14 == 2) {
            arrayList = contactsController2.sortedUsersMutualSectionsArray;
        } else {
            arrayList = contactsController2.sortedUsersSectionsArray;
        }
        if (i14 != 0 && !this.B) {
            if (i10 < arrayList.size()) {
                ArrayList<TLRPC.TL_contact> arrayList2 = hashMap.get(arrayList.get(i10));
                if (i11 < arrayList2.size()) {
                    return MessagesController.getInstance(i13).getUser(Long.valueOf(arrayList2.get(i11).user_id));
                }
            }
            return null;
        } else if (i10 == 0) {
            return null;
        } else {
            if (this.C == 2) {
                if (i10 == 1) {
                    if (i11 >= this.f48532y.size()) {
                        return null;
                    }
                    return MessagesController.getInstance(i13).getUser(Long.valueOf(((TLRPC.TL_contact) this.f48532y.get(i11)).user_id));
                }
            } else {
                int i15 = i10 - 1;
                if (i15 < arrayList.size()) {
                    ArrayList<TLRPC.TL_contact> arrayList3 = hashMap.get(arrayList.get(i15));
                    if (i11 >= arrayList3.size()) {
                        return null;
                    }
                    return MessagesController.getInstance(i13).getUser(Long.valueOf(arrayList3.get(i11).user_id));
                }
            }
            if (!this.f48530w || i11 < 0 || i11 >= ContactsController.getInstance(i13).phoneBookContacts.size()) {
                return null;
            }
            return ContactsController.getInstance(i13).phoneBookContacts.get(i11);
        }
    }

    @Override
    public final int P(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: uf.d.P(int, int):int");
    }

    @Override
    public final View T(int i10, View view) {
        ArrayList<String> arrayList;
        View view2;
        int i11 = this.f48528r;
        int i12 = this.v;
        ContactsController contactsController = ContactsController.getInstance(i11);
        if (i12 == 2) {
            HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap = contactsController.usersMutualSectionsDict;
        } else {
            HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap2 = contactsController.usersSectionsDict;
        }
        ContactsController contactsController2 = ContactsController.getInstance(i11);
        if (i12 == 2) {
            arrayList = contactsController2.sortedUsersMutualSectionsArray;
        } else {
            arrayList = contactsController2.sortedUsersSectionsArray;
        }
        if (view == null) {
            ?? frameLayout = new FrameLayout(this.f48529s);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(64.0f)));
            TextView textView = new TextView(frameLayout.getContext());
            frameLayout.f23554a = textView;
            yh.p(22.0f, 1, textView);
            yh.t(k6.B6, null, false, textView, 17);
            frameLayout.addView(textView, c6.d(-1, -1.0f, 119, 12.0f, 0.0f, 0.0f, 0.0f));
            view2 = frameLayout;
        } else {
            view2 = view;
        }
        r4 r4Var = (r4) view2;
        if (this.C != 2 && !this.E && !this.F) {
            if (i12 != 0 && !this.B) {
                if (i10 < arrayList.size()) {
                    r4Var.setLetter(arrayList.get(i10));
                    return view2;
                }
                r4Var.setLetter("");
                return view2;
            } else if (i10 == 0) {
                r4Var.setLetter("");
                return view2;
            } else {
                int i13 = i10 - 1;
                if (i13 < arrayList.size()) {
                    r4Var.setLetter(arrayList.get(i13));
                    return view2;
                }
                r4Var.setLetter("");
                return view2;
            }
        }
        r4Var.setLetter("");
        return view2;
    }

    @Override
    public final boolean V(int i10, int i11, f2.m1 m1Var) {
        HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap;
        ArrayList<String> arrayList;
        if (this.H) {
            if (i10 != 1 || i11 <= 1) {
                return false;
            }
        } else {
            int i12 = this.v;
            int i13 = this.f48528r;
            ContactsController contactsController = ContactsController.getInstance(i13);
            if (i12 == 2) {
                hashMap = contactsController.usersMutualSectionsDict;
            } else {
                hashMap = contactsController.usersSectionsDict;
            }
            ContactsController contactsController2 = ContactsController.getInstance(i13);
            if (i12 == 2) {
                arrayList = contactsController2.sortedUsersMutualSectionsArray;
            } else {
                arrayList = contactsController2.sortedUsersSectionsArray;
            }
            boolean z4 = this.B;
            if (i12 != 0 && !z4) {
                if (this.F || i11 >= hashMap.get(arrayList.get(i10)).size()) {
                    return false;
                }
            } else if (i10 == 0) {
                if (z4) {
                    if (i11 >= 1) {
                        return false;
                    }
                } else if (this.f48530w) {
                    if (i11 >= 2) {
                        return false;
                    }
                } else if (i11 >= 3) {
                    return false;
                }
            } else if (!this.F) {
                if (this.C == 2) {
                    if (i10 == 1 && i11 >= this.f48532y.size()) {
                        return false;
                    }
                } else {
                    int i14 = i10 - 1;
                    if (i14 < arrayList.size() && i11 >= hashMap.get(arrayList.get(i14)).size()) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void W(int i10, int i11, f2.m1 m1Var) {
        HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap;
        ArrayList<String> arrayList;
        int i12;
        ArrayList<TLRPC.TL_contact> arrayList2;
        float f10;
        int i13 = m1Var.f5879f;
        View view = m1Var.f5875a;
        int i14 = 7;
        boolean z4 = this.B;
        int i15 = this.f48528r;
        boolean z10 = true;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 4) {
                        if (i13 != 7) {
                            if (i13 == 8) {
                                p4 p4Var = (p4) view;
                                int i16 = i11 - 2;
                                if (i16 >= 0 && i16 < ContactsController.getInstance(i15).phoneBookContacts.size()) {
                                    p4Var.f23334f = ContactsController.getInstance(i15).phoneBookContacts.get(i16);
                                    p4Var.h = null;
                                    p4Var.a();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        m4 m4Var = (m4) view;
                        if (this.H && i11 == 1 && i10 == 1) {
                            m4Var.setText(LocaleController.getString(R.string.InviteFriends));
                            return;
                        } else if (this.C == 1) {
                            m4Var.setText(LocaleController.getString(R.string.SortedByName));
                            return;
                        } else {
                            m4Var.setText(LocaleController.getString(R.string.SortedByLastSeen));
                            return;
                        }
                    }
                    if (!this.G) {
                        f10 = 96.0f;
                    } else {
                        f10 = 25.0f;
                    }
                    view.setPadding(0, AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(18.0f));
                    return;
                }
                u3 u3Var = (u3) view;
                int i17 = this.C;
                if (i17 == 0) {
                    u3Var.setText(LocaleController.getString(R.string.Contacts));
                    return;
                } else if (i17 == 1) {
                    u3Var.setText(LocaleController.getString(R.string.SortedByName));
                    return;
                } else {
                    u3Var.setText(LocaleController.getString(R.string.SortedByLastSeen));
                    return;
                }
            }
            o8 o8Var = (o8) view;
            boolean z11 = this.f48530w;
            if (!z11 && z4) {
                int i18 = k6.il;
                o8Var.e(i18, i18);
            } else {
                int i19 = k6.G6;
                o8Var.e(i19, i19);
            }
            if (i10 == 0) {
                if (z11) {
                    if (i11 == 0) {
                        o8Var.p(LocaleController.getString(R.string.InviteFriends), "", false, R.drawable.settings_invite, -14899731, -15431455, false);
                        return;
                    } else if (i11 == 1) {
                        o8Var.p(LocaleController.getString(R.string.RecentCalls), "", false, R.drawable.settings_calls, -11154873, -14175180, false);
                        return;
                    } else {
                        return;
                    }
                } else if (z4) {
                    if (this.D) {
                        o8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                        return;
                    }
                    o8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                    return;
                } else if (i11 == 0) {
                    o8Var.p(LocaleController.getString(R.string.NewGroup), "", false, R.drawable.settings_group, -14899731, -15431455, false);
                    return;
                } else if (i11 == 1) {
                    o8Var.p(LocaleController.getString(R.string.NewChannel), "", false, R.drawable.settings_channel, -11154873, -14175180, false);
                    return;
                } else {
                    return;
                }
            }
            ContactsController.Contact contact = ContactsController.getInstance(i15).phoneBookContacts.get(i11);
            String str = contact.first_name;
            if (str != null && contact.last_name != null) {
                o8Var.i(contact.first_name + " " + contact.last_name, false);
                return;
            } else if (str != null && contact.last_name == null) {
                o8Var.i(str, false);
                return;
            } else {
                o8Var.i(contact.last_name, false);
                return;
            }
        }
        va vaVar = (va) view;
        vaVar.Q.f17223a = false;
        if (this.C != 2 && !this.E) {
            i14 = 58;
        }
        vaVar.b(i14, 1);
        if (this.C == 2) {
            arrayList2 = this.f48532y;
        } else {
            int i20 = this.v;
            ContactsController contactsController = ContactsController.getInstance(i15);
            if (i20 == 2) {
                hashMap = contactsController.usersMutualSectionsDict;
            } else {
                hashMap = contactsController.usersSectionsDict;
            }
            if (i20 == 2) {
                arrayList = ContactsController.getInstance(i15).sortedUsersMutualSectionsArray;
            } else {
                arrayList = ContactsController.getInstance(i15).sortedUsersSectionsArray;
            }
            if (i20 != 0 && !z4) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            arrayList2 = hashMap.get(arrayList.get(i10 - i12));
        }
        TLRPC.User user = MessagesController.getInstance(i15).getUser(Long.valueOf(arrayList2.get(i11).user_id));
        vaVar.d(user, null, null, false);
        if (this.f48531x.h(user.f20990id) < 0) {
            z10 = false;
        }
        vaVar.c(z10, false);
    }

    public final void Y(int i10, boolean z4) {
        this.C = i10;
        if (i10 == 2) {
            if (this.f48532y == null || z4) {
                int i11 = this.f48528r;
                this.f48532y = new ArrayList(ContactsController.getInstance(i11).contacts);
                long j10 = UserConfig.getInstance(i11).clientUserId;
                int size = this.f48532y.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    } else if (((TLRPC.TL_contact) this.f48532y.get(i12)).user_id == j10) {
                        this.f48532y.remove(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            Z();
            return;
        }
        l();
    }

    public final void Z() {
        int i10 = this.f48528r;
        if (this.f48532y == null) {
            return;
        }
        try {
            int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
            Collections.sort(this.f48532y, new q30(MessagesController.getInstance(i10), currentTime, 1));
            l();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        float f10;
        View view2;
        Context context = this.f48529s;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 7) {
                                if (i10 != 8) {
                                    if (i10 != 9) {
                                        view = new z6(context, (org.telegram.ui.b) null);
                                    } else {
                                        View jnVar = new jn(context, 28);
                                        jnVar.setId(9);
                                        jnVar.setTag(-33024);
                                        view2 = jnVar;
                                    }
                                } else {
                                    view = new p4(context, false);
                                }
                            } else {
                                view = new m4(this.f48529s, k6.L6, 21, 14, 5, false, false, null);
                            }
                        } else {
                            FrameLayout hc1Var = new hc1(this, context, viewGroup);
                            hc1Var.addView(new sq(context), c6.e(-1, -2, 17));
                            hc1Var.setLayoutParams(new f2.x0(-1, -2));
                            hc1Var.setTag(-33024);
                            view2 = hc1Var;
                        }
                        view = view2;
                    } else {
                        View c3Var = new c3(context, null);
                        float f11 = 72.0f;
                        if (LocaleController.isRTL) {
                            f10 = 28.0f;
                        } else {
                            f10 = 72.0f;
                        }
                        int dp = AndroidUtilities.dp(f10);
                        int dp2 = AndroidUtilities.dp(8.0f);
                        if (!LocaleController.isRTL) {
                            f11 = 28.0f;
                        }
                        c3Var.setPadding(dp, dp2, AndroidUtilities.dp(f11), AndroidUtilities.dp(8.0f));
                        view = c3Var;
                    }
                } else {
                    view = new u3(context, null);
                }
            } else {
                view = new o8(context);
            }
        } else {
            va vaVar = new va(context, 58, 1, false);
            vaVar.setCallCellStyle(58);
            view = vaVar;
        }
        return new f2.m1(view);
    }
}

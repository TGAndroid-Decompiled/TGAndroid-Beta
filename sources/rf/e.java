package rf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import f2.n1;
import i7.f6;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.a3;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k30;
import org.telegram.ui.Components.mq;
import org.telegram.ui.th;
public abstract class e extends fl0 {
    public final boolean A;
    public int B;
    public final boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final int f47202r = UserConfig.selectedAccount;
    public final Context f47203s;
    public final int v;
    public final boolean f47204w;
    public final a0.h f47205x;
    public ArrayList f47206y;

    public e(Context context, int i10, boolean z10, a0.h hVar, int i11) {
        boolean z11;
        this.f47203s = context;
        this.v = i10;
        this.f47204w = z10;
        this.f47205x = hVar;
        if (i11 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.A = z11;
        this.C = i11 == 2;
    }

    @Override
    public final String F(int i10) {
        ArrayList<String> arrayList;
        if (this.B != 2 && !this.E) {
            int i11 = this.f47202r;
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
            if (i12 != 0 && !this.A) {
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
    public final void G(jl0 jl0Var, float f9, int[] iArr) {
        iArr[0] = (int) (h() * f9);
        iArr[1] = 0;
    }

    @Override
    public final int M(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: rf.e.M(int):int");
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
        boolean z10 = this.G;
        int i13 = this.f47202r;
        if (z10 && i10 == 1 && i11 > 1 && i11 - 2 < ContactsController.getInstance(i13).phoneBookContacts.size()) {
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
        if (i14 != 0 && !this.A) {
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
            if (this.B == 2) {
                if (i10 == 1) {
                    if (i11 >= this.f47206y.size()) {
                        return null;
                    }
                    return MessagesController.getInstance(i13).getUser(Long.valueOf(((TLRPC.TL_contact) this.f47206y.get(i11)).user_id));
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
            if (!this.f47204w || i11 < 0 || i11 >= ContactsController.getInstance(i13).phoneBookContacts.size()) {
                return null;
            }
            return ContactsController.getInstance(i13).phoneBookContacts.get(i11);
        }
    }

    @Override
    public final int P(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: rf.e.P(int, int):int");
    }

    @Override
    public final View T(int i10, View view) {
        ArrayList<String> arrayList;
        View view2;
        int i11 = this.f47202r;
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
            ?? frameLayout = new FrameLayout(this.f47203s);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(64.0f)));
            TextView textView = new TextView(frameLayout.getContext());
            frameLayout.f24971a = textView;
            th.n(22.0f, 1, textView);
            th.s(g6.B6, null, false, textView, 17);
            frameLayout.addView(textView, f6.d(-1, -1.0f, 119, 12.0f, 0.0f, 0.0f, 0.0f));
            view2 = frameLayout;
        } else {
            view2 = view;
        }
        p4 p4Var = (p4) view2;
        if (this.B != 2 && !this.D && !this.E) {
            if (i12 != 0 && !this.A) {
                if (i10 < arrayList.size()) {
                    p4Var.setLetter(arrayList.get(i10));
                    return view2;
                }
                p4Var.setLetter("");
                return view2;
            } else if (i10 == 0) {
                p4Var.setLetter("");
                return view2;
            } else {
                int i13 = i10 - 1;
                if (i13 < arrayList.size()) {
                    p4Var.setLetter(arrayList.get(i13));
                    return view2;
                }
                p4Var.setLetter("");
                return view2;
            }
        }
        p4Var.setLetter("");
        return view2;
    }

    @Override
    public final boolean V(int i10, int i11, n1 n1Var) {
        HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap;
        ArrayList<String> arrayList;
        if (this.G) {
            if (i10 != 1 || i11 <= 1) {
                return false;
            }
        } else {
            int i12 = this.v;
            int i13 = this.f47202r;
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
            boolean z10 = this.A;
            if (i12 != 0 && !z10) {
                if (this.E || i11 >= hashMap.get(arrayList.get(i10)).size()) {
                    return false;
                }
            } else if (i10 == 0) {
                if (z10) {
                    if (i11 >= 1) {
                        return false;
                    }
                } else if (this.f47204w) {
                    if (i11 >= 2) {
                        return false;
                    }
                } else if (i11 >= 3) {
                    return false;
                }
            } else if (!this.E) {
                if (this.B == 2) {
                    if (i10 == 1 && i11 >= this.f47206y.size()) {
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
    public final void W(int i10, int i11, n1 n1Var) {
        HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap;
        ArrayList<String> arrayList;
        int i12;
        ArrayList<TLRPC.TL_contact> arrayList2;
        float f9;
        int i13 = n1Var.f6436f;
        View view = n1Var.f6432a;
        int i14 = 7;
        boolean z10 = this.A;
        int i15 = this.f47202r;
        boolean z11 = true;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 4) {
                        if (i13 != 7) {
                            if (i13 == 8) {
                                n4 n4Var = (n4) view;
                                int i16 = i11 - 2;
                                if (i16 >= 0 && i16 < ContactsController.getInstance(i15).phoneBookContacts.size()) {
                                    n4Var.f24749f = ContactsController.getInstance(i15).phoneBookContacts.get(i16);
                                    n4Var.h = null;
                                    n4Var.a();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        k4 k4Var = (k4) view;
                        if (this.G && i11 == 1 && i10 == 1) {
                            k4Var.setText(LocaleController.getString(R.string.InviteFriends));
                            return;
                        } else if (this.B == 1) {
                            k4Var.setText(LocaleController.getString(R.string.SortedByName));
                            return;
                        } else {
                            k4Var.setText(LocaleController.getString(R.string.SortedByLastSeen));
                            return;
                        }
                    }
                    if (!this.F) {
                        f9 = 96.0f;
                    } else {
                        f9 = 25.0f;
                    }
                    view.setPadding(0, AndroidUtilities.dp(f9), 0, AndroidUtilities.dp(18.0f));
                    return;
                }
                s3 s3Var = (s3) view;
                int i17 = this.B;
                if (i17 == 0) {
                    s3Var.setText(LocaleController.getString(R.string.Contacts));
                    return;
                } else if (i17 == 1) {
                    s3Var.setText(LocaleController.getString(R.string.SortedByName));
                    return;
                } else {
                    s3Var.setText(LocaleController.getString(R.string.SortedByLastSeen));
                    return;
                }
            }
            m8 m8Var = (m8) view;
            boolean z12 = this.f47204w;
            if (!z12 && z10) {
                int i18 = g6.il;
                m8Var.e(i18, i18);
            } else {
                int i19 = g6.G6;
                m8Var.e(i19, i19);
            }
            if (i10 == 0) {
                if (z12) {
                    if (i11 == 0) {
                        m8Var.p(LocaleController.getString(R.string.InviteFriends), "", false, R.drawable.settings_invite, -14899731, -15431455, false);
                        return;
                    } else if (i11 == 1) {
                        m8Var.p(LocaleController.getString(R.string.RecentCalls), "", false, R.drawable.settings_calls, -11154873, -14175180, false);
                        return;
                    } else {
                        return;
                    }
                } else if (z10) {
                    if (this.C) {
                        m8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                        return;
                    }
                    m8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                    return;
                } else if (i11 == 0) {
                    m8Var.p(LocaleController.getString(R.string.NewGroup), "", false, R.drawable.settings_group, -14899731, -15431455, false);
                    return;
                } else if (i11 == 1) {
                    m8Var.p(LocaleController.getString(R.string.NewChannel), "", false, R.drawable.settings_channel, -11154873, -14175180, false);
                    return;
                } else {
                    return;
                }
            }
            ContactsController.Contact contact = ContactsController.getInstance(i15).phoneBookContacts.get(i11);
            String str = contact.first_name;
            if (str != null && contact.last_name != null) {
                m8Var.i(contact.first_name + " " + contact.last_name, false);
                return;
            } else if (str != null && contact.last_name == null) {
                m8Var.i(str, false);
                return;
            } else {
                m8Var.i(contact.last_name, false);
                return;
            }
        }
        sa saVar = (sa) view;
        saVar.P.f15665a = false;
        if (this.B != 2 && !this.D) {
            i14 = 58;
        }
        saVar.b(i14, 1);
        if (this.B == 2) {
            arrayList2 = this.f47206y;
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
            if (i20 != 0 && !z10) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            arrayList2 = hashMap.get(arrayList.get(i10 - i12));
        }
        TLRPC.User user = MessagesController.getInstance(i15).getUser(Long.valueOf(arrayList2.get(i11).user_id));
        saVar.d(user, null, null, false);
        if (this.f47205x.h(user.f22539id) < 0) {
            z11 = false;
        }
        saVar.c(z11, false);
    }

    public final void Y(int i10, boolean z10) {
        this.B = i10;
        if (i10 == 2) {
            if (this.f47206y == null || z10) {
                int i11 = this.f47202r;
                this.f47206y = new ArrayList(ContactsController.getInstance(i11).contacts);
                long j10 = UserConfig.getInstance(i11).clientUserId;
                int size = this.f47206y.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    } else if (((TLRPC.TL_contact) this.f47206y.get(i12)).user_id == j10) {
                        this.f47206y.remove(i12);
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
        int i10 = this.f47202r;
        if (this.f47206y == null) {
            return;
        }
        try {
            int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
            Collections.sort(this.f47206y, new k30(MessagesController.getInstance(i10), currentTime, 1));
            l();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final n1 x(ViewGroup viewGroup, int i10) {
        View view;
        float f9;
        View view2;
        Context context = this.f47203s;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 7) {
                                if (i10 != 8) {
                                    if (i10 != 9) {
                                        view = new x6(context, (org.telegram.ui.b) null);
                                    } else {
                                        View fnVar = new fn(context, 28);
                                        fnVar.setId(9);
                                        fnVar.setTag(-33024);
                                        view2 = fnVar;
                                    }
                                } else {
                                    view = new n4(context, false);
                                }
                            } else {
                                view = new k4(this.f47203s, g6.L6, 21, 14, 5, false, false, null);
                            }
                        } else {
                            FrameLayout dVar = new d(this, context, viewGroup, 0);
                            dVar.addView(new mq(context), f6.e(-1, -2, 17));
                            dVar.setLayoutParams(new f2.x0(-1, -2));
                            dVar.setTag(-33024);
                            view2 = dVar;
                        }
                        view = view2;
                    } else {
                        View a3Var = new a3(context, null);
                        float f10 = 72.0f;
                        if (LocaleController.isRTL) {
                            f9 = 28.0f;
                        } else {
                            f9 = 72.0f;
                        }
                        int dp = AndroidUtilities.dp(f9);
                        int dp2 = AndroidUtilities.dp(8.0f);
                        if (!LocaleController.isRTL) {
                            f10 = 28.0f;
                        }
                        a3Var.setPadding(dp, dp2, AndroidUtilities.dp(f10), AndroidUtilities.dp(8.0f));
                        view = a3Var;
                    }
                } else {
                    view = new s3(context, null);
                }
            } else {
                view = new m8(context);
            }
        } else {
            sa saVar = new sa(context, 58, 1, false);
            saVar.setCallCellStyle(58);
            view = saVar;
        }
        return new n1(view);
    }
}

package org.telegram.ui.web;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.qv0;
public final class o extends org.telegram.ui.ActionBar.j {
    public final q f42195a;

    public o(q qVar) {
        this.f42195a = qVar;
    }

    @Override
    public final void b(int i10) {
        String str;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        q qVar = this.f42195a;
        HashSet hashSet = qVar.f42216w;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.n2) qVar).actionBar;
            if (kVar.s()) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) qVar).actionBar;
                kVar2.r();
                hashSet.clear();
                AndroidUtilities.forEachViews((RecyclerView) qVar.f32849a, (e2.h) new n(0));
                return;
            }
            qVar.finishFragment();
        } else if (i10 == R.id.menu_delete) {
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList = new ArrayList();
            HashSet hashSet3 = new HashSet();
            Iterator it = hashSet.iterator();
            while (true) {
                MessageObject messageObject = null;
                int i11 = 0;
                if (!it.hasNext()) {
                    break;
                }
                int intValue = ((Integer) it.next()).intValue();
                ArrayList arrayList2 = qVar.d.f42132a;
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    Object obj = arrayList2.get(i12);
                    i12++;
                    MessageObject messageObject2 = (MessageObject) obj;
                    if (messageObject2 != null && messageObject2.getId() == intValue) {
                        messageObject = messageObject2;
                        break;
                    }
                }
                j jVar = qVar.f42211e;
                if (jVar != null && messageObject == null) {
                    ArrayList arrayList3 = jVar.f42132a;
                    int size2 = arrayList3.size();
                    while (true) {
                        if (i11 >= size2) {
                            break;
                        }
                        Object obj2 = arrayList3.get(i11);
                        i11++;
                        MessageObject messageObject3 = (MessageObject) obj2;
                        if (messageObject3 != null && messageObject3.getId() == intValue) {
                            messageObject = messageObject3;
                            break;
                        }
                    }
                }
                if (messageObject != null) {
                    arrayList.add(messageObject);
                    hashSet3.add(Integer.valueOf(messageObject.getId()));
                    hashSet2.add(l.a(messageObject));
                }
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qVar.getParentActivity(), 0, qVar.getResourceProvider());
            alertDialog$Builder.f20198a.R = LocaleController.formatPluralString("DeleteOptionsTitle", hashSet3.size(), new Object[0]);
            if (hashSet3.size() == 1) {
                str = "AreYouSureUnsaveSingleMessage";
            } else {
                str = "AreYouSureUnsaveFewMessages";
            }
            alertDialog$Builder.f20198a.T = LocaleController.getString(str);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qv0(22, qVar, hashSet3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        } else if (i10 == R.id.menu_link) {
            qVar.d0();
        }
    }
}

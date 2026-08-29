package th;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class s4 implements NotificationCenter.NotificationCenterDelegate {
    public volatile String A;
    public String B;
    public TLRPC.InputFile C;
    public boolean D;
    public final int f48736a;
    public final String f48737b;
    public final boolean f48738c;
    public final boolean d;
    public final boolean f48739e;
    public final int f48740f;
    public final int h;
    public final int f48741n;
    public final TLRPC.Document f48742r;
    public final r4 f48743s;
    public boolean v;
    public boolean f48744w;
    public boolean f48745x;
    public int f48746y;

    public s4(int i10, String str, boolean z10, int i11, int i12, int i13, c3 c3Var) {
        this.f48736a = i10;
        this.f48737b = str;
        this.f48738c = z10;
        this.d = false;
        this.f48739e = false;
        this.f48740f = i11;
        this.h = i12;
        this.f48741n = i13;
        this.f48742r = null;
        this.f48743s = c3Var;
    }

    public final void a(String str) {
        int i10;
        boolean z10;
        if (!this.f48744w && !this.f48745x) {
            this.A = str;
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f48736a);
            notificationCenter.addObserver(this, NotificationCenter.fileUploaded);
            notificationCenter.addObserver(this, NotificationCenter.fileUploadFailed);
            notificationCenter.addObserver(this, NotificationCenter.fileUploadProgressChanged);
            if (this.f48738c) {
                i10 = 33554432;
            } else if (this.d) {
                i10 = 50331648;
            } else if (this.f48739e) {
                i10 = 67108864;
            } else {
                i10 = 16777216;
            }
            FileLoader fileLoader = FileLoader.getInstance(this.f48736a);
            String str2 = this.A;
            if (!this.f48738c && !this.d && !this.f48739e) {
                z10 = true;
            } else {
                z10 = false;
            }
            fileLoader.uploadFile(str2, false, z10, i10);
        }
    }

    public final void b() {
        if (!this.f48745x && !this.f48744w) {
            this.f48744w = true;
            try {
                if (this.A != null) {
                    FileLoader.getInstance(this.f48736a).cancelFileUpload(this.A, false);
                }
            } catch (Throwable unused) {
            }
            if (this.f48746y != 0) {
                ConnectionsManager.getInstance(this.f48736a).cancelRequest(this.f48746y, true);
                this.f48746y = 0;
            }
            e();
        }
    }

    public final void c(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2) {
        String str;
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
        if (this.f48738c) {
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_inputMediaUploadedDocument.file = inputFile;
            tL_inputMediaUploadedDocument.mime_type = "video/mp4";
            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
            tL_documentAttributeVideo.supports_streaming = true;
            tL_documentAttributeVideo.duration = this.f48741n;
            tL_documentAttributeVideo.f22399w = this.f48740f;
            tL_documentAttributeVideo.h = this.h;
            tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        } else {
            boolean z10 = this.d;
            boolean z11 = this.f48739e;
            if (!z10 && !z11) {
                TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                tL_inputMediaUploadedPhoto.file = inputFile;
                tL_messages_uploadMedia.media = tL_inputMediaUploadedPhoto;
            } else {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = new TLRPC.TL_inputMediaUploadedDocument();
                tL_inputMediaUploadedDocument2.file = inputFile;
                TLRPC.Document document = this.f48742r;
                if (z11) {
                    str = "application/octet-stream";
                } else if (document == null || (str = document.mime_type) == null) {
                    str = "audio/mpeg";
                }
                tL_inputMediaUploadedDocument2.mime_type = str;
                if (document != null) {
                    if (z11) {
                        ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            TLRPC.DocumentAttribute documentAttribute = arrayList.get(i10);
                            i10++;
                            TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeFilename) {
                                tL_inputMediaUploadedDocument2.attributes.add(documentAttribute2);
                            }
                        }
                    } else {
                        tL_inputMediaUploadedDocument2.attributes.addAll(document.attributes);
                    }
                }
                if (z11) {
                    tL_inputMediaUploadedDocument2.force_file = true;
                    if (inputFile2 != null) {
                        tL_inputMediaUploadedDocument2.thumb = inputFile2;
                        tL_inputMediaUploadedDocument2.flags |= 4;
                    }
                }
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument2;
            }
        }
        this.f48746y = ConnectionsManager.getInstance(this.f48736a).sendRequest(tL_messages_uploadMedia, new ef.a(this, 29));
    }

    public final void d() {
        int i10;
        int i11;
        if (!this.v && !this.f48744w && !this.f48745x) {
            this.v = true;
            if (this.f48738c) {
                r4 r4Var = this.f48743s;
                int i12 = this.f48740f;
                if (i12 > 0 && (i11 = this.h) > 0) {
                    r4Var.a(i12, i11);
                }
                a(this.f48737b);
            } else if (this.f48739e) {
                Utilities.globalQueue.postRunnable(new q4(this, 0));
            } else if (this.d) {
                a(this.f48737b);
            } else {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(this.f48737b, options);
                    int i13 = options.outWidth;
                    if (i13 > 0 && (i10 = options.outHeight) > 0) {
                        this.f48743s.a(i13, i10);
                    }
                } catch (Exception unused) {
                }
                Utilities.globalQueue.postRunnable(new q4(this, 1));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        float f9;
        TLRPC.InputFile inputFile;
        if (i11 == this.f48736a && !this.f48744w && !this.f48745x) {
            String str = (String) objArr[0];
            if (this.A != null && this.A.equals(str)) {
                if (i10 == NotificationCenter.fileUploaded) {
                    TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
                    if (this.f48739e && !this.D && !TextUtils.isEmpty(this.B)) {
                        this.C = inputFile2;
                        this.D = true;
                        this.A = this.B;
                        FileLoader.getInstance(this.f48736a).uploadFile(this.A, false, true, 16777216);
                    } else if (this.f48739e && this.D) {
                        c(this.C, inputFile2);
                    } else {
                        c(inputFile2, null);
                    }
                } else if (i10 == NotificationCenter.fileUploadFailed) {
                    if (this.f48739e && this.D && (inputFile = this.C) != null) {
                        c(inputFile, null);
                        return;
                    }
                    this.f48745x = true;
                    e();
                    this.f48743s.onError();
                } else if (i10 == NotificationCenter.fileUploadProgressChanged) {
                    long longValue = ((Long) objArr[1]).longValue();
                    long longValue2 = ((Long) objArr[2]).longValue();
                    r4 r4Var = this.f48743s;
                    if (!this.D) {
                        if (longValue2 > 0) {
                            f9 = ((float) longValue) / ((float) longValue2);
                        } else {
                            f9 = 0.0f;
                        }
                        r4Var.f(f9);
                    }
                }
            }
        }
    }

    public final void e() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f48736a);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploaded);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploadFailed);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploadProgressChanged);
    }

    public s4(int i10, String str, TLRPC.Document document, a3 a3Var) {
        this.f48736a = i10;
        this.f48737b = str;
        this.f48738c = false;
        this.d = true;
        this.f48739e = false;
        this.f48740f = 0;
        this.h = 0;
        this.f48741n = 0;
        this.f48742r = document;
        this.f48743s = a3Var;
    }

    public s4(int i10, String str, TLRPC.Document document, z2 z2Var) {
        this.f48736a = i10;
        this.f48737b = str;
        this.f48738c = false;
        this.d = false;
        this.f48739e = true;
        this.f48740f = 0;
        this.h = 0;
        this.f48741n = 0;
        this.f48742r = document;
        this.f48743s = z2Var;
    }
}

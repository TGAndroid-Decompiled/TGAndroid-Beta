package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class MHTML {
    public final String boundary;
    public final ArrayList entries;
    public final HashMap entriesByLocation;
    public final File file;
    private final long[] filePos;
    public final HashMap headers;

    public MHTML(File file) throws IOException {
        HashMap map = new HashMap();
        this.headers = map;
        this.entries = new ArrayList();
        this.entriesByLocation = new HashMap();
        this.filePos = new long[1];
        this.file = file;
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        map.putAll(parseHeaders(bufferedReader));
        String prop = HeaderValue.getProp((HeaderValue) map.get("content-type"), "boundary");
        this.boundary = prop;
        if (prop != null) {
            parseEntries(bufferedReader, fileInputStream);
        }
        bufferedReader.close();
    }

    private void parseEntries(BufferedReader bufferedReader, FileInputStream fileInputStream) throws IOException {
        int length = this.boundary.length() + 2;
        Entry entry = null;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            long[] jArr = this.filePos;
            jArr[0] = jArr[0] + line.getBytes().length + 2;
            if (line.length() == length && line.substring(2).equals(this.boundary)) {
                if (entry != null) {
                    entry.end = (this.filePos[0] - length) - 2;
                    this.entries.add(entry);
                    this.entriesByLocation.put(entry.getLocation(), entry);
                }
                entry = new Entry();
                entry.file = this.file;
                entry.headers.putAll(parseHeaders(bufferedReader));
                entry.start = this.filePos[0];
            }
        }
        if (entry == null || entry.start == 0 || entry.end == 0) {
            return;
        }
        this.entries.add(entry);
        this.entriesByLocation.put(entry.getLocation(), entry);
    }

    private HashMap parseHeaders(BufferedReader bufferedReader) throws IOException {
        String str;
        StringBuilder sb;
        HashMap map = new HashMap();
        loop0: while (true) {
            str = null;
            sb = null;
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break loop0;
                }
                long[] jArr = this.filePos;
                jArr[0] = jArr[0] + line.getBytes().length + 2;
                String strTrim = line.trim();
                if (strTrim.isEmpty()) {
                    break loop0;
                }
                if (str != null && sb != null) {
                    sb.append(strTrim);
                    if (!strTrim.endsWith(";")) {
                        break;
                    }
                } else {
                    int iIndexOf = strTrim.indexOf(58);
                    if (iIndexOf >= 0) {
                        String strTrim2 = strTrim.substring(0, iIndexOf).trim();
                        String strTrim3 = strTrim.substring(iIndexOf + 1).trim();
                        if (strTrim3.endsWith(";")) {
                            sb = new StringBuilder();
                            sb.append(strTrim3);
                            str = strTrim2;
                        } else {
                            appendHeader(strTrim2, strTrim3, map);
                        }
                    }
                }
            }
            appendHeader(str, sb.toString(), map);
        }
        if (str != null && sb != null) {
            appendHeader(str, sb.toString(), map);
        }
        return map;
    }

    private static void appendHeader(String str, String str2, HashMap map) {
        HeaderValue headerValue = new HeaderValue();
        String[] strArrSplit = str2.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        for (int i = 0; i < strArrSplit.length; i++) {
            String strTrim = strArrSplit[i].trim();
            if (!strTrim.isEmpty()) {
                int iIndexOf = strTrim.indexOf(61);
                if (i == 0 || iIndexOf < 0) {
                    headerValue.value = strTrim;
                } else {
                    String strTrim2 = strTrim.substring(0, iIndexOf).trim();
                    String strTrim3 = strTrim.substring(iIndexOf + 1).trim();
                    if (strTrim3.length() >= 2 && strTrim3.charAt(0) == '\"' && strTrim3.charAt(strTrim3.length() - 1) == '\"') {
                        strTrim3 = strTrim3.substring(1, strTrim3.length() - 1);
                    }
                    headerValue.props.put(strTrim2, strTrim3);
                }
            }
        }
        map.put(str.trim().toLowerCase(), headerValue);
    }

    public static class Entry {
        public long end;
        public File file;
        public final HashMap headers;
        public long start;

        private Entry() {
            this.headers = new HashMap();
        }

        public String getType() {
            return HeaderValue.getValue((HeaderValue) this.headers.get("content-type"));
        }

        public String getLocation() {
            return HeaderValue.getValue((HeaderValue) this.headers.get("content-location"));
        }

        public String getTransferEncoding() {
            return HeaderValue.getValue((HeaderValue) this.headers.get("content-transfer-encoding"));
        }

        public InputStream getRawInputStream() {
            return new BoundedInputStream(this.file, this.start, this.end);
        }

        public InputStream getInputStream() {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(getRawInputStream());
            if ("base64".equals(getTransferEncoding())) {
                return new Base64InputStream(bufferedInputStream, 0);
            }
            return "quoted-printable".equalsIgnoreCase(getTransferEncoding()) ? new QuotedPrintableInputStream(bufferedInputStream) : bufferedInputStream;
        }
    }

    public static class HeaderValue {
        public final HashMap props;
        public String value;

        private HeaderValue() {
            this.props = new HashMap();
        }

        public static String getValue(HeaderValue headerValue) {
            if (headerValue == null) {
                return null;
            }
            return headerValue.value;
        }

        public static String getProp(HeaderValue headerValue, String str) {
            if (headerValue == null) {
                return null;
            }
            return (String) headerValue.props.get(str);
        }
    }

    public static class QuotedPrintableInputStream extends FilterInputStream {
        private int hexDigitToInt(int i) {
            if (i >= 48 && i <= 57) {
                return i - 48;
            }
            if (i >= 65 && i <= 70) {
                return i - 55;
            }
            if (i < 97 || i > 102) {
                return 0;
            }
            return i - 87;
        }

        public QuotedPrintableInputStream(InputStream inputStream) {
            super(inputStream);
        }

        @Override
        public int read() throws IOException {
            int i = ((FilterInputStream) this).in.read();
            if (i != 61) {
                return i;
            }
            int i2 = ((FilterInputStream) this).in.read();
            int i3 = ((FilterInputStream) this).in.read();
            if (i2 == -1 || i3 == -1) {
                return -1;
            }
            if (i2 == 13 && i3 == 10) {
                return read();
            }
            return (i2 == 10 || i3 == 10) ? i3 : hexToByte(i2, i3);
        }

        @Override
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                int i5 = read();
                if (i5 != -1) {
                    bArr[i + i3] = (byte) i5;
                    i4++;
                    i3++;
                } else if (i4 == 0) {
                    return -1;
                }
            }
            return i4;
        }

        private int hexToByte(int i, int i2) {
            return (hexDigitToInt(i) << 4) | hexDigitToInt(i2);
        }
    }

    public static class BoundedInputStream extends FileInputStream {
        private long bytesRead;
        private final long endOffset;

        public BoundedInputStream(File file, long j, long j2) {
            super(file);
            this.bytesRead = 0L;
            this.endOffset = j2;
            if (j > 0 && skip(j) != j) {
                throw new RuntimeException("BoundedInputStream failed to skip");
            }
        }

        @Override
        public int read() {
            if (getChannel().position() >= this.endOffset) {
                return -1;
            }
            return super.read();
        }

        @Override
        public int read(byte[] bArr, int i, int i2) throws IOException {
            long jPosition = getChannel().position();
            long j = this.endOffset;
            if (jPosition >= j) {
                return -1;
            }
            long jPosition2 = j - getChannel().position();
            if (i2 > jPosition2) {
                i2 = (int) jPosition2;
            }
            return super.read(bArr, i, i2);
        }
    }
}

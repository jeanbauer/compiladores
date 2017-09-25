/* The following code was generated by JFlex 1.6.1 */

import java.util.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>C:/Users/Diego/Dropbox/Ulbra/Compiladores/Exercicio 4/acha.flex</tt>
 */
class Acha {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\0\1\31\1\31\1\31\123\0\1\1\1\5\1\11\1\16"+
    "\1\7\1\17\1\21\1\13\1\15\1\0\1\10\1\20\1\27\1\14"+
    "\1\4\1\25\1\0\1\6\1\12\1\3\1\2\1\26\1\23\1\30"+
    "\1\24\1\22\12\0\1\31\u1fa2\0\1\31\1\31\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\20\1\1\2\20\0\1\3\1\4\31\0\1\5"+
    "\2\0\1\6\6\0\1\7\5\0\1\10\1\11\1\0"+
    "\1\12\2\0\1\13\11\0\1\14\1\15\1\0\1\16"+
    "\3\0\1\17\4\0\1\20\2\0\1\21\5\0\1\22"+
    "\1\23\3\0\1\24\1\0\1\25\1\0\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\3\0\1\34\2\0\1\35"+
    "\1\0\1\36\1\37\1\40\1\41";

  private static int [] zzUnpackAction() {
    int [] result = new int[141];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\32\0\64\0\116\0\150\0\202\0\234\0\266"+
    "\0\320\0\352\0\u0104\0\u011e\0\u0138\0\u0152\0\u016c\0\u0186"+
    "\0\u01a0\0\32\0\u01ba\0\u01d4\0\u01ee\0\u0208\0\u0222\0\u023c"+
    "\0\u0256\0\u0270\0\u028a\0\u02a4\0\u02be\0\u02d8\0\u02f2\0\u030c"+
    "\0\u0326\0\u0340\0\32\0\u035a\0\u0374\0\u038e\0\u03a8\0\u03c2"+
    "\0\u03dc\0\u03f6\0\u0410\0\u042a\0\u0444\0\u045e\0\u0478\0\u0492"+
    "\0\u04ac\0\u04c6\0\u04e0\0\u04fa\0\u0514\0\u052e\0\u0548\0\u0562"+
    "\0\u057c\0\u0596\0\u05b0\0\u05ca\0\u05e4\0\32\0\u05fe\0\u0618"+
    "\0\32\0\u0632\0\u064c\0\u0666\0\u0680\0\u069a\0\u06b4\0\32"+
    "\0\u06ce\0\u06e8\0\u0702\0\u071c\0\u0736\0\32\0\32\0\u0750"+
    "\0\32\0\u076a\0\u0784\0\32\0\u079e\0\u07b8\0\u07d2\0\u07ec"+
    "\0\u0806\0\u0820\0\u083a\0\u0854\0\u086e\0\32\0\32\0\u0888"+
    "\0\32\0\u08a2\0\u08bc\0\u08d6\0\32\0\u08f0\0\u090a\0\u0924"+
    "\0\u093e\0\32\0\u0958\0\u0972\0\32\0\u098c\0\u09a6\0\u09c0"+
    "\0\u09da\0\u09f4\0\32\0\32\0\u0a0e\0\u0a28\0\u0a42\0\32"+
    "\0\u0a5c\0\32\0\u0a76\0\32\0\32\0\32\0\32\0\32"+
    "\0\32\0\u0a90\0\u0aaa\0\u0ac4\0\32\0\u0ade\0\u0af8\0\32"+
    "\0\u0b12\0\32\0\32\0\32\0\32";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[141];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\2\1\6\1\7\1\10"+
    "\1\2\1\11\1\12\2\2\1\13\1\14\1\15\1\16"+
    "\1\17\1\2\1\20\2\2\1\21\2\2\1\22\34\0"+
    "\1\23\43\0\1\24\41\0\1\25\13\0\1\26\32\0"+
    "\1\27\36\0\1\30\3\0\1\31\7\0\1\32\2\0"+
    "\1\33\2\0\1\34\6\0\1\35\21\0\1\36\7\0"+
    "\1\37\1\0\1\40\5\0\1\41\22\0\1\42\2\0"+
    "\1\43\16\0\1\44\2\0\1\45\26\0\1\46\13\0"+
    "\1\47\15\0\1\50\31\0\1\51\40\0\1\52\22\0"+
    "\1\53\30\0\1\54\40\0\1\55\44\0\1\56\13\0"+
    "\1\57\25\0\1\60\15\0\1\61\12\0\1\62\41\0"+
    "\1\63\22\0\1\64\40\0\1\65\33\0\1\66\16\0"+
    "\1\67\31\0\1\70\4\0\1\71\27\0\1\72\46\0"+
    "\1\73\1\74\24\0\1\75\17\0\1\76\30\0\1\77"+
    "\46\0\1\100\20\0\1\101\27\0\1\102\41\0\1\103"+
    "\20\0\1\104\43\0\1\105\31\0\1\106\2\0\1\107"+
    "\15\0\1\110\42\0\1\111\23\0\1\112\23\0\1\113"+
    "\32\0\1\114\44\0\1\115\43\0\1\116\11\0\1\117"+
    "\31\0\1\120\31\0\1\121\25\0\1\122\6\0\1\123"+
    "\25\0\1\124\26\0\1\125\30\0\1\126\35\0\1\127"+
    "\37\0\1\130\24\0\1\131\25\0\1\132\33\0\1\133"+
    "\25\0\1\134\31\0\1\135\51\0\1\136\14\0\1\137"+
    "\45\0\1\140\27\0\1\141\14\0\1\142\51\0\1\143"+
    "\26\0\1\144\23\0\1\145\27\0\1\146\35\0\1\147"+
    "\25\0\1\150\40\0\1\151\17\0\1\152\43\0\1\153"+
    "\25\0\1\154\23\0\1\155\35\0\1\156\26\0\1\157"+
    "\36\0\1\160\40\0\1\161\13\0\1\162\32\0\1\163"+
    "\35\0\1\164\25\0\1\165\42\0\1\166\24\0\1\167"+
    "\36\0\1\170\20\0\1\171\42\0\1\172\31\0\1\173"+
    "\26\0\1\174\23\0\1\175\44\0\1\176\32\0\1\177"+
    "\25\0\1\200\25\0\1\201\42\0\1\202\26\0\1\203"+
    "\23\0\1\204\41\0\1\205\21\0\1\206\24\0\1\207"+
    "\32\0\1\210\46\0\1\211\27\0\1\212\21\0\1\213"+
    "\32\0\1\214\31\0\1\215\22\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2860];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\17\1\1\11\20\0\1\11\1\1\31\0"+
    "\1\11\2\0\1\11\6\0\1\11\5\0\2\11\1\0"+
    "\1\11\2\0\1\11\11\0\2\11\1\0\1\11\3\0"+
    "\1\11\4\0\1\11\2\0\1\11\5\0\2\11\3\0"+
    "\1\11\1\0\1\11\1\0\6\11\3\0\1\11\2\0"+
    "\1\11\1\0\4\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[141];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
	int autoP=0, breakP=0, caseP=0, charP=0, constP=0, continueP=0, defaultP=0, doP=0, intP=0,longP=0, registerP=0, returnP=0, shortP=0, signedP=0, sizeofP=0, staticP=0, structP=0,switchP=0, typedefP=0, unionP=0, unsignedP=0, voidP=0, volatileP=0, whileP=0,doubleP=0, elseP=0, enumP=0, externP=0, floatP=0, forP=0, gotoP=0, ifP=0;
	public void finaliza(){
		System.out.println("auto: " + this.autoP);
		System.out.println("break: " + this.breakP);
		System.out.println("case :" + this.caseP);
		System.out.println("char: " + this.charP);
		System.out.println("const: " + this.constP);
		System.out.println("continue: " + this.continueP);
		System.out.println("default: " + this.defaultP);
		System.out.println("do: " + this.doP);
		System.out.println("int: " + this.intP);
		System.out.println("long: " + this.longP);
		System.out.println("register: " + this.registerP);
		System.out.println("return: " + this.returnP);
		System.out.println("short: " + this.shortP);
		System.out.println("signed: " + this.signedP);
		System.out.println("sizeof: " + this.sizeofP);
		System.out.println("static: " + this.staticP);
		System.out.println("struct: " + this.structP);
		System.out.println("switch: " + this.switchP);
		System.out.println("typedef: " + this.typedefP);
		System.out.println("unsigned: " + this.unsignedP);
		System.out.println("void: " + this.voidP);
		System.out.println("volatile: " + this.volatileP);
		System.out.println("while: " + this.whileP);
		System.out.println("double: " + this.doubleP);
		System.out.println("else: " + this.elseP);
		System.out.println("enum: " + this.enumP);
		System.out.println("extern: " + this.externP);
		System.out.println("float: " + this.floatP);
		System.out.println("for: " + this.forP);
		System.out.println("goto: " + this.gotoP);
		System.out.println("if: " + this.ifP);
	}
	public boolean getEOF(){
		return this.zzAtEOF;
	}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Acha(java.io.Reader in) {
  	
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 108) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
              {
                finaliza(); System.exit(0);
              }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { 
            }
          case 34: break;
          case 2: 
            { System.out.print(yytext());
            }
          case 35: break;
          case 3: 
            { this.ifP++;
            }
          case 36: break;
          case 4: 
            { this.doP++;
            }
          case 37: break;
          case 5: 
            { this.intP++;
            }
          case 38: break;
          case 6: 
            { this.forP++;
            }
          case 39: break;
          case 7: 
            { this.autoP++;
            }
          case 40: break;
          case 8: 
            { this.enumP++;
            }
          case 41: break;
          case 9: 
            { this.elseP++;
            }
          case 42: break;
          case 10: 
            { this.caseP++;
            }
          case 43: break;
          case 11: 
            { this.charP++;
            }
          case 44: break;
          case 12: 
            { this.longP++;
            }
          case 45: break;
          case 13: 
            { this.gotoP++;
            }
          case 46: break;
          case 14: 
            { this.voidP++;
            }
          case 47: break;
          case 15: 
            { this.breakP++;
            }
          case 48: break;
          case 16: 
            { this.constP++;
            }
          case 49: break;
          case 17: 
            { this.shortP++;
            }
          case 50: break;
          case 18: 
            { this.floatP++;
            }
          case 51: break;
          case 19: 
            { this.whileP++;
            }
          case 52: break;
          case 20: 
            { this.returnP++;
            }
          case 53: break;
          case 21: 
            { this.externP++;
            }
          case 54: break;
          case 22: 
            { this.staticP++;
            }
          case 55: break;
          case 23: 
            { this.structP++;
            }
          case 56: break;
          case 24: 
            { this.signedP++;
            }
          case 57: break;
          case 25: 
            { this.sizeofP++;
            }
          case 58: break;
          case 26: 
            { this.switchP++;
            }
          case 59: break;
          case 27: 
            { this.doubleP++;
            }
          case 60: break;
          case 28: 
            { this.typedefP++;
            }
          case 61: break;
          case 29: 
            { this.defaultP++;
            }
          case 62: break;
          case 30: 
            { this.unsignedP++;
            }
          case 63: break;
          case 31: 
            { this.registerP++;
            }
          case 64: break;
          case 32: 
            { this.continueP++;
            }
          case 65: break;
          case 33: 
            { this.volatileP++;
            }
          case 66: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java Acha [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Acha scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Acha(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
